package com.pushwoosh.notification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import k9.h;
import k9.i;
import ka.e;
import n7.l;
import n9.b;

/* loaded from: classes2.dex */
public class LocalNotificationReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22631a = "LocalNotificationReceiver";

    private static class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final Bundle f22632a;

        a(Bundle bundle) {
            this.f22632a = bundle;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            l.i().n().b(this.f22632a);
            return null;
        }
    }

    private static long a(b bVar, long j10) {
        return j10 + Math.max(5000L, bVar.e() - j10);
    }

    private static Intent b(Context context, int i10, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) LocalNotificationReceiver.class);
        intent.putExtras(bundle);
        intent.putExtra("local_push_id", String.valueOf(i10));
        return intent;
    }

    private static boolean c(long j10, PendingIntent pendingIntent) {
        try {
            AlarmManager alarmManagerE = c9.a.e().e();
            if (alarmManagerE == null) {
                return false;
            }
            alarmManagerE.set(0, j10, pendingIntent);
            return true;
        } catch (SecurityException unused) {
            h.l(f22631a, String.format("Too many alarms. Please clear all local alarm to continue use AlarmManager. Local notification will be skipped", new Object[0]));
            return false;
        }
    }

    private static boolean d(b bVar, long j10) {
        return j10 - bVar.e() >= 604800000;
    }

    public static void e(b bVar, long j10) {
        try {
            Context contextB = c9.a.b();
            if (contextB == null) {
                h.l(f22631a, "Incorrect state of app. Context is null");
            } else if (d(bVar, j10)) {
                e.b().d(bVar.d());
            } else {
                int iD = bVar.d();
                c(a(bVar, j10), PendingIntent.getBroadcast(contextB, iD, b(contextB, iD, bVar.a()), i.a(134217728)));
            }
        } catch (Exception e5) {
            h.m(f22631a, "Creation of local notification failed.", e5);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                return;
            }
            e.b().d(Integer.parseInt(extras.getString("local_push_id")));
            new a(extras).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } catch (Exception e5) {
            h.o(e5);
        }
    }
}
