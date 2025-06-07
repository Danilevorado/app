package k3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a, reason: collision with root package name */
    private Bundle f24630a = new Bundle();

    /* renamed from: b, reason: collision with root package name */
    private List f24631b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f24632c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f24633d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final Bundle f24634e = new Bundle();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f24635f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private final List f24636g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private int f24637h = -1;

    /* renamed from: i, reason: collision with root package name */
    private String f24638i = null;

    /* renamed from: j, reason: collision with root package name */
    private final List f24639j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f24640k = 60000;

    public final c4 a() {
        return new c4(8, -1L, this.f24630a, -1, this.f24631b, this.f24632c, this.f24633d, false, null, null, null, null, this.f24634e, this.f24635f, this.f24636g, null, null, false, null, this.f24637h, this.f24638i, this.f24639j, this.f24640k, null);
    }

    public final d4 b(Bundle bundle) {
        this.f24630a = bundle;
        return this;
    }

    public final d4 c(int i10) {
        this.f24640k = i10;
        return this;
    }

    public final d4 d(boolean z10) {
        this.f24632c = z10;
        return this;
    }

    public final d4 e(List list) {
        this.f24631b = list;
        return this;
    }

    public final d4 f(String str) {
        this.f24638i = str;
        return this;
    }

    public final d4 g(int i10) {
        this.f24633d = i10;
        return this;
    }

    public final d4 h(int i10) {
        this.f24637h = i10;
        return this;
    }
}
