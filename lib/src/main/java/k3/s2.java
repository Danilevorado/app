package k3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class s2 {

    /* renamed from: g, reason: collision with root package name */
    private Date f24739g;

    /* renamed from: h, reason: collision with root package name */
    private String f24740h;

    /* renamed from: k, reason: collision with root package name */
    private String f24743k;

    /* renamed from: l, reason: collision with root package name */
    private String f24744l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f24746n;

    /* renamed from: o, reason: collision with root package name */
    private String f24747o;

    /* renamed from: a, reason: collision with root package name */
    private final HashSet f24733a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f24734b = new Bundle();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f24735c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f24736d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f24737e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f24738f = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final List f24741i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f24742j = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f24745m = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f24748p = 60000;

    public final void a(int i10) {
        this.f24742j = i10;
    }

    public final void b(boolean z10) {
        this.f24746n = z10;
    }

    public final void c(boolean z10) {
        this.f24745m = z10 ? 1 : 0;
    }

    public final void t(String str) {
        this.f24733a.add(str);
    }

    public final void u(Class cls, Bundle bundle) {
        this.f24734b.putBundle(cls.getName(), bundle);
    }

    public final void v(String str) {
        this.f24736d.add(str);
    }

    public final void w(String str) {
        this.f24736d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void x(Date date) {
        this.f24739g = date;
    }
}
