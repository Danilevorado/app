package com.onesignal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.e3;
import java.util.Iterator;

/* loaded from: classes.dex */
abstract class s0 {

    /* renamed from: c, reason: collision with root package name */
    protected static final Object f22343c = new Object();

    /* renamed from: a, reason: collision with root package name */
    protected boolean f22344a = false;

    /* renamed from: b, reason: collision with root package name */
    private Thread f22345b;

    s0() {
    }

    private boolean g(Context context) {
        return h.a(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0;
    }

    private boolean h(Context context) {
        Thread thread;
        Iterator<JobInfo> it = ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == e() && (thread = this.f22345b) != null && thread.isAlive()) {
                return true;
            }
        }
        return false;
    }

    private void j(Context context, long j10) {
        e3.a(e3.z.VERBOSE, getClass().getSimpleName() + " scheduleServiceSyncTask:atTime: " + j10);
        ((AlarmManager) context.getSystemService("alarm")).set(0, e3.B0().b() + j10, m(context));
    }

    private void k(Context context, long j10) {
        e3.z zVar = e3.z.VERBOSE;
        e3.a(zVar, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j10);
        if (h(context)) {
            e3.a(zVar, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!");
            this.f22344a = true;
            return;
        }
        JobInfo.Builder builder = new JobInfo.Builder(e(), new ComponentName(context, (Class<?>) c()));
        builder.setMinimumLatency(j10).setRequiredNetworkType(1);
        if (g(context)) {
            builder.setPersisted(true);
        }
        try {
            int iSchedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            e3.a(e3.z.INFO, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + iSchedule);
        } catch (NullPointerException e5) {
            e3.b(e3.z.ERROR, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e5);
        }
    }

    private PendingIntent m(Context context) {
        return PendingIntent.getService(context, e(), new Intent(context, (Class<?>) d()), 201326592);
    }

    private static boolean n() {
        return true;
    }

    protected void a(Context context) {
        e3.i1(e3.z.DEBUG, getClass().getSimpleName() + " cancel background sync");
        synchronized (f22343c) {
            if (n()) {
                ((JobScheduler) context.getSystemService("jobscheduler")).cancel(e());
            } else {
                ((AlarmManager) context.getSystemService("alarm")).cancel(m(context));
            }
        }
    }

    void b(Context context, Runnable runnable) throws InterruptedException {
        e3.i1(e3.z.DEBUG, "OSBackground sync, calling initWithContext");
        e3.Q0(context);
        Thread thread = new Thread(runnable, f());
        this.f22345b = thread;
        OSUtils.W(thread);
    }

    protected abstract Class c();

    protected abstract Class d();

    protected abstract int e();

    protected abstract String f();

    protected void i(Context context, long j10) {
        synchronized (f22343c) {
            if (n()) {
                k(context, j10);
            } else {
                j(context, j10);
            }
        }
    }

    boolean l() {
        Thread thread = this.f22345b;
        if (thread == null || !thread.isAlive()) {
            return false;
        }
        this.f22345b.interrupt();
        return true;
    }
}
