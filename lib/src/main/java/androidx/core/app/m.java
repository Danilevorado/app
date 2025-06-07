package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class m implements k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2101a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f2102b;

    /* renamed from: c, reason: collision with root package name */
    private final l.e f2103c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f2104d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f2105e;

    /* renamed from: f, reason: collision with root package name */
    private final List f2106f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f2107g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f2108h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f2109i;

    m(l.e eVar) {
        int i10;
        this.f2103c = eVar;
        this.f2101a = eVar.f2070a;
        this.f2102b = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(eVar.f2070a, eVar.K) : new Notification.Builder(eVar.f2070a);
        Notification notification = eVar.R;
        this.f2102b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2078i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f2074e).setContentText(eVar.f2075f).setContentInfo(eVar.f2080k).setContentIntent(eVar.f2076g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f2077h, (notification.flags & 128) != 0).setLargeIcon(eVar.f2079j).setNumber(eVar.f2081l).setProgress(eVar.f2089t, eVar.f2090u, eVar.f2091v);
        this.f2102b.setSubText(eVar.f2086q).setUsesChronometer(eVar.f2084o).setPriority(eVar.f2082m);
        Iterator it = eVar.f2071b.iterator();
        while (it.hasNext()) {
            b((l.a) it.next());
        }
        Bundle bundle = eVar.D;
        if (bundle != null) {
            this.f2107g.putAll(bundle);
        }
        int i11 = Build.VERSION.SDK_INT;
        this.f2104d = eVar.H;
        this.f2105e = eVar.I;
        this.f2102b.setShowWhen(eVar.f2083n);
        this.f2102b.setLocalOnly(eVar.f2095z).setGroup(eVar.f2092w).setGroupSummary(eVar.f2093x).setSortKey(eVar.f2094y);
        this.f2108h = eVar.O;
        this.f2102b.setCategory(eVar.C).setColor(eVar.E).setVisibility(eVar.F).setPublicVersion(eVar.G).setSound(notification.sound, notification.audioAttributes);
        List listE = i11 < 28 ? e(g(eVar.f2072c), eVar.U) : eVar.U;
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                this.f2102b.addPerson((String) it2.next());
            }
        }
        this.f2109i = eVar.J;
        if (eVar.f2073d.size() > 0) {
            Bundle bundle2 = eVar.e().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i12 = 0; i12 < eVar.f2073d.size(); i12++) {
                bundle4.putBundle(Integer.toString(i12), n.a((l.a) eVar.f2073d.get(i12)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.e().putBundle("android.car.EXTENSIONS", bundle2);
            this.f2107g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i13 = Build.VERSION.SDK_INT;
        Icon icon = eVar.T;
        if (icon != null) {
            this.f2102b.setSmallIcon(icon);
        }
        if (i13 >= 24) {
            this.f2102b.setExtras(eVar.D).setRemoteInputHistory(eVar.f2088s);
            RemoteViews remoteViews = eVar.H;
            if (remoteViews != null) {
                this.f2102b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.I;
            if (remoteViews2 != null) {
                this.f2102b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.J;
            if (remoteViews3 != null) {
                this.f2102b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i13 >= 26) {
            this.f2102b.setBadgeIconType(eVar.L).setSettingsText(eVar.f2087r).setShortcutId(eVar.M).setTimeoutAfter(eVar.N).setGroupAlertBehavior(eVar.O);
            if (eVar.B) {
                this.f2102b.setColorized(eVar.A);
            }
            if (!TextUtils.isEmpty(eVar.K)) {
                this.f2102b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it3 = eVar.f2072c.iterator();
            if (it3.hasNext()) {
                a5.a.a(it3.next());
                throw null;
            }
        }
        if (i13 >= 29) {
            this.f2102b.setAllowSystemGeneratedContextualActions(eVar.Q);
            this.f2102b.setBubbleMetadata(l.d.a(null));
        }
        if (i13 >= 31 && (i10 = eVar.P) != 0) {
            this.f2102b.setForegroundServiceBehavior(i10);
        }
        if (eVar.S) {
            if (this.f2103c.f2093x) {
                this.f2108h = 2;
            } else {
                this.f2108h = 1;
            }
            this.f2102b.setVibrate(null);
            this.f2102b.setSound(null);
            int i14 = notification.defaults & (-2) & (-3);
            notification.defaults = i14;
            this.f2102b.setDefaults(i14);
            if (i13 >= 26) {
                if (TextUtils.isEmpty(this.f2103c.f2092w)) {
                    this.f2102b.setGroup("silent");
                }
                this.f2102b.setGroupAlertBehavior(this.f2108h);
            }
        }
    }

    private void b(l.a aVar) {
        IconCompat iconCompatD = aVar.d();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatD != null ? iconCompatD.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : q.b(aVar.e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i10 >= 28) {
            builder.setSemanticAction(aVar.f());
        }
        if (i10 >= 29) {
            builder.setContextual(aVar.j());
        }
        if (i10 >= 31) {
            builder.setAuthenticationRequired(aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        builder.addExtras(bundle);
        this.f2102b.addAction(builder.build());
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        q.b bVar = new q.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        a5.a.a(it.next());
        throw null;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.k
    public Notification.Builder a() {
        return this.f2102b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        l.h hVar = this.f2103c.f2085p;
        if (hVar != null) {
            hVar.b(this);
        }
        RemoteViews remoteViewsE = hVar != null ? hVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null || (remoteViewsE = this.f2103c.H) != null) {
            notificationD.contentView = remoteViewsE;
        }
        if (hVar != null && (remoteViewsD = hVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (hVar != null && (remoteViewsF = this.f2103c.f2085p.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (hVar != null && (bundleA = l.a(notificationD)) != null) {
            hVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f2102b.build();
        }
        if (i10 >= 24) {
            Notification notificationBuild = this.f2102b.build();
            if (this.f2108h != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.f2108h == 2) {
                    h(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.f2108h == 1) {
                    h(notificationBuild);
                }
            }
            return notificationBuild;
        }
        this.f2102b.setExtras(this.f2107g);
        Notification notificationBuild2 = this.f2102b.build();
        RemoteViews remoteViews = this.f2104d;
        if (remoteViews != null) {
            notificationBuild2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f2105e;
        if (remoteViews2 != null) {
            notificationBuild2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f2109i;
        if (remoteViews3 != null) {
            notificationBuild2.headsUpContentView = remoteViews3;
        }
        if (this.f2108h != 0) {
            if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && this.f2108h == 2) {
                h(notificationBuild2);
            }
            if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && this.f2108h == 1) {
                h(notificationBuild2);
            }
        }
        return notificationBuild2;
    }

    Context f() {
        return this.f2101a;
    }
}
