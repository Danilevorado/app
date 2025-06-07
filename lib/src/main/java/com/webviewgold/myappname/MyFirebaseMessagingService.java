package com.webviewgold.myappname;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.l;
import com.facebook.ads.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.n0;
import java.util.Map;

/* loaded from: classes2.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: s, reason: collision with root package name */
    private final String f22718s = ">>>>>>>>>";

    private void v(n0.b bVar, String str, int i10) {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.addFlags(67108864);
        if (!str.equals("")) {
            intent.putExtra("ONESIGNAL_URL", str);
        }
        int i11 = Build.VERSION.SDK_INT;
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 1140850688);
        String string = getString(R.string.default_notification_channel_id);
        l.e eVarN = new l.e(this, string).F(R.mipmap.ic_launcher).p(bVar.c()).o(bVar.a()).h(true).l(true).k(i10).G(RingtoneManager.getDefaultUri(2)).n(activity);
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (i11 >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel(string, "Channel human readable title", 4));
        }
        notificationManager.notify(1, eVarN.c());
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(n0 n0Var) {
        if (h8.b.a(n0Var)) {
            h8.b.b(getApplicationContext(), n0Var);
            return;
        }
        int color = Color.parseColor(getResources().getString(R.color.colorAccent));
        super.q(n0Var);
        if (d.f22733a.booleanValue()) {
            Log.d(">>>>>>>>>", "onMessageReceived: " + n0Var);
        }
        String str = "";
        for (Map.Entry entry : n0Var.f().entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2.equals("url")) {
                str = str3;
            }
            if (str2.equals("color")) {
                color = Color.parseColor(str3);
            }
            if (d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>", "key, " + str2 + " value " + str3);
            }
        }
        if (n0Var.v() != null) {
            v(n0Var.v(), str, color);
            if (d.f22733a.booleanValue()) {
                Log.d(">>>>>>>>>", "Message Notification Body: " + n0Var.v().a());
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void s(String str) {
        super.s(str);
        a.i(this, str);
        h8.b.c(str);
    }
}
