package com.onesignal;

import com.onesignal.e3;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
abstract class v0 {
    static void a(TimerTask timerTask, String str, long j10) {
        e3.i1(e3.z.DEBUG, "scheduleTrigger: " + str + " delay: " + j10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("trigger_timer:");
        sb2.append(str);
        new Timer(sb2.toString()).schedule(timerTask, j10);
    }
}
