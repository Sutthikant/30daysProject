package com.manop.a30days.ui.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.manop.a30days.R

data class DailyActivity(
    @StringRes val day: Int,
    @StringRes val activityName: Int,
    @DrawableRes val activityPicture: Int,
    @StringRes val activityDetail: Int
)

val dailyActivities = listOf(
    DailyActivity(R.string.day1, R.string.activityName1, R.drawable.image1, R.string.activityDetail1),
    DailyActivity(R.string.day2, R.string.activityName2, R.drawable.image2, R.string.activityDetail2),
    DailyActivity(R.string.day3, R.string.activityName3, R.drawable.image3, R.string.activityDetail3),
    DailyActivity(R.string.day4, R.string.activityName4, R.drawable.image4, R.string.activityDetail4),
    DailyActivity(R.string.day5, R.string.activityName5, R.drawable.image5, R.string.activityDetail5),
    DailyActivity(R.string.day6, R.string.activityName6, R.drawable.image6, R.string.activityDetail6),
    DailyActivity(R.string.day7, R.string.activityName7, R.drawable.image7, R.string.activityDetail7),
    DailyActivity(R.string.day8, R.string.activityName8, R.drawable.image8, R.string.activityDetail8),
    DailyActivity(R.string.day9, R.string.activityName9, R.drawable.image9, R.string.activityDetail9),
    DailyActivity(R.string.day10, R.string.activityName10, R.drawable.image10, R.string.activityDetail10),
    DailyActivity(R.string.day11, R.string.activityName11, R.drawable.image1, R.string.activityDetail11),
    DailyActivity(R.string.day12, R.string.activityName12, R.drawable.image2, R.string.activityDetail12),
    DailyActivity(R.string.day13, R.string.activityName13, R.drawable.image3, R.string.activityDetail13),
    DailyActivity(R.string.day14, R.string.activityName14, R.drawable.image4, R.string.activityDetail14),
    DailyActivity(R.string.day15, R.string.activityName15, R.drawable.image5, R.string.activityDetail15),
    DailyActivity(R.string.day16, R.string.activityName16, R.drawable.image6, R.string.activityDetail16),
    DailyActivity(R.string.day17, R.string.activityName17, R.drawable.image7, R.string.activityDetail17),
    DailyActivity(R.string.day18, R.string.activityName18, R.drawable.image8, R.string.activityDetail18),
    DailyActivity(R.string.day19, R.string.activityName19, R.drawable.image9, R.string.activityDetail19),
    DailyActivity(R.string.day20, R.string.activityName20, R.drawable.image10, R.string.activityDetail20),
    DailyActivity(R.string.day21, R.string.activityName21, R.drawable.image1, R.string.activityDetail21),
    DailyActivity(R.string.day22, R.string.activityName22, R.drawable.image2, R.string.activityDetail22),
    DailyActivity(R.string.day23, R.string.activityName23, R.drawable.image3, R.string.activityDetail23),
    DailyActivity(R.string.day24, R.string.activityName24, R.drawable.image4, R.string.activityDetail24),
    DailyActivity(R.string.day25, R.string.activityName25, R.drawable.image5, R.string.activityDetail25),
    DailyActivity(R.string.day26, R.string.activityName26, R.drawable.image6, R.string.activityDetail26),
    DailyActivity(R.string.day27, R.string.activityName27, R.drawable.image7, R.string.activityDetail27),
    DailyActivity(R.string.day28, R.string.activityName28, R.drawable.image8, R.string.activityDetail28),
    DailyActivity(R.string.day29, R.string.activityName29, R.drawable.image9, R.string.activityDetail29),
    DailyActivity(R.string.day30, R.string.activityName30, R.drawable.image10, R.string.activityDetail30)
)
