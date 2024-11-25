package com.manop.a30days

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manop.a30days.ui.data.DailyActivity
import com.manop.a30days.ui.data.dailyActivities
import com.manop.a30days.ui.theme.Project30daysTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project30daysTheme {
                DailyActivityApp()

            }
        }
    }
}

@Composable
fun DailyActivityApp(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            DailyActivityTopBar()
        }
    ) { innerPadding ->
        LazyColumn(modifier.padding(innerPadding)) {
            items(dailyActivities) {
                DailyActivityItem(
                    dailyActivity = it,
                    modifier = Modifier.padding(16.dp))
            }
        }
    }
}

@Composable
fun DailyActivityItem(
    dailyActivity: DailyActivity,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf( false) }
    val targetValue = if (expanded) {
        MaterialTheme.colorScheme.tertiaryContainer
    } else {
        MaterialTheme.colorScheme.primaryContainer
    }
    val color by animateColorAsState(
        targetValue = targetValue
    )
    Card (modifier = modifier.clickable { expanded = !expanded }) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = color)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessMedium
                    )
                )

        ){
            Text(
                modifier = Modifier.padding(
                    top = 16.dp,
                    start = 16.dp,
                    end = 16.dp
                ),
                text = stringResource(dailyActivity.day),
                style = MaterialTheme.typography.displaySmall
            )

            Text(
                modifier = Modifier.padding(
                    top = 8.dp,
                    start = 16.dp,
                    end = 16.dp
                ),
                text = stringResource(dailyActivity.activityName),
                style = MaterialTheme.typography.displayMedium
            )
            Image(
                modifier = Modifier.fillMaxWidth().padding(16.dp),
                painter = painterResource(dailyActivity.activityPicture),
                contentScale = ContentScale.Crop,
                contentDescription = stringResource(dailyActivity.activityName)
            )

            if (expanded) {
                Text(
                    modifier = Modifier.padding(
                        start = 16.dp,
                        end = 16.dp,
                        bottom = 16.dp
                    ),
                    text = stringResource(dailyActivity.activityDetail),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DailyActivityTopBar (modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.displayLarge
            )
        },
        modifier = modifier,
    )
}


@Preview(showBackground = true)
@Composable
fun ActivityAppPreview() {
    Project30daysTheme {
        DailyActivityApp()
    }
}