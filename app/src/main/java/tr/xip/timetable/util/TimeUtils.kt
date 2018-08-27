package tr.xip.timetable.util

object TimeUtils {
    var times: MutableMap<Int, String> = mutableMapOf(
            Pair(0, "12 AM"),
            Pair(1, "1 AM"),
            Pair(2, "2 AM"),
            Pair(3, "3 AM"),
            Pair(4, "4 AM"),
            Pair(5, "5 AM"),
            Pair(6, "6 AM"),
            Pair(7, "7 AM"),
            Pair(8, "8:30 AM"),
            Pair(9, "9:30 AM"),
            Pair(10, "10:30 AM"),
            Pair(11, "11:30 AM"),
            Pair(12, "12:30 PM"),
            Pair(13, "1 PM"),
            Pair(14, "2 PM"),
            Pair(15, "3 PM"),
            Pair(16, "4 PM"),
            Pair(17, "5 PM"),
            Pair(18, "6 PM"),
            Pair(19, "7 PM"),
            Pair(20, "8 PM"),
            Pair(21, "9 PM"),
            Pair(22, "10 PM"),
            Pair(23, "11 PM")
    )

    fun getDisplayableTime(time: Int): String = if (time in 0..23) times[time]!! else "?"
}
