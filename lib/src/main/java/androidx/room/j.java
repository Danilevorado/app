package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.i0;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import u0.h;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final h.c f3701a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3702b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3703c;

    /* renamed from: d, reason: collision with root package name */
    public final i0.d f3704d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3705e;

    /* renamed from: f, reason: collision with root package name */
    public final List f3706f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3707g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3708h;

    /* renamed from: i, reason: collision with root package name */
    public final i0.c f3709i;

    /* renamed from: j, reason: collision with root package name */
    public final Executor f3710j;

    /* renamed from: k, reason: collision with root package name */
    public final Executor f3711k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3712l;

    /* renamed from: m, reason: collision with root package name */
    public final Intent f3713m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f3714n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3715o;

    /* renamed from: p, reason: collision with root package name */
    private final Set f3716p;

    /* renamed from: q, reason: collision with root package name */
    public final String f3717q;

    /* renamed from: r, reason: collision with root package name */
    public final File f3718r;

    /* renamed from: s, reason: collision with root package name */
    public final Callable f3719s;

    public j(Context context, String str, h.c cVar, i0.d dVar, List list, boolean z10, i0.c cVar2, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, i0.e eVar, List list2, List list3) {
        this.f3701a = cVar;
        this.f3702b = context;
        this.f3703c = str;
        this.f3704d = dVar;
        this.f3705e = list;
        this.f3708h = z10;
        this.f3709i = cVar2;
        this.f3710j = executor;
        this.f3711k = executor2;
        this.f3713m = intent;
        this.f3712l = intent != null;
        this.f3714n = z11;
        this.f3715o = z12;
        this.f3716p = set;
        this.f3717q = str2;
        this.f3718r = file;
        this.f3719s = callable;
        this.f3706f = list2 == null ? Collections.emptyList() : list2;
        this.f3707g = list3 == null ? Collections.emptyList() : list3;
    }

    public boolean a(int i10, int i11) {
        Set set;
        if ((i10 > i11) && this.f3715o) {
            return false;
        }
        return this.f3714n && ((set = this.f3716p) == null || !set.contains(Integer.valueOf(i10)));
    }
}
