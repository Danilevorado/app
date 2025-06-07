package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import b1.b;
import b1.k;
import b1.l;
import b1.u;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.ze0;
import l4.b;
import m3.s0;

/* loaded from: classes.dex */
public class WorkManagerUtil extends s0 {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void L5(Context context) {
        try {
            u.h(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // m3.t0
    public final void zze(l4.a aVar) {
        Context context = (Context) b.L0(aVar);
        L5(context);
        try {
            u uVarG = u.g(context);
            uVarG.a("offline_ping_sender_work");
            uVarG.b((l) ((l.a) ((l.a) new l.a(OfflinePingSender.class).j(new b.a().b(k.CONNECTED).a())).a("offline_ping_sender_work")).b());
        } catch (IllegalStateException e5) {
            ze0.h("Failed to instantiate WorkManager.", e5);
        }
    }

    @Override // m3.t0
    public final boolean zzf(l4.a aVar, String str, String str2) throws Throwable {
        Context context = (Context) l4.b.L0(aVar);
        L5(context);
        b1.b bVarA = new b.a().b(k.CONNECTED).a();
        try {
            u.g(context).b((l) ((l.a) ((l.a) ((l.a) new l.a(OfflineNotificationPoster.class).j(bVarA)).m(new b.a().h("uri", str).h("gws_query_id", str2).a())).a("offline_notification_work")).b());
            return true;
        } catch (IllegalStateException e5) {
            ze0.h("Failed to instantiate WorkManager.", e5);
            return false;
        }
    }
}
