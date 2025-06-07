package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class mi4 implements gh4 {

    /* renamed from: a, reason: collision with root package name */
    private final s43 f12138a;

    /* renamed from: b, reason: collision with root package name */
    private int f12139b;

    /* renamed from: c, reason: collision with root package name */
    private final li4 f12140c;

    /* renamed from: d, reason: collision with root package name */
    private final ll4 f12141d;

    /* renamed from: e, reason: collision with root package name */
    private final ce4 f12142e;

    public mi4(s43 s43Var, li4 li4Var) {
        ce4 ce4Var = new ce4();
        ll4 ll4Var = new ll4(-1);
        this.f12138a = s43Var;
        this.f12140c = li4Var;
        this.f12142e = ce4Var;
        this.f12141d = ll4Var;
        this.f12139b = 1048576;
    }

    public final mi4 a(int i10) {
        this.f12139b = i10;
        return this;
    }

    public final oi4 b(v30 v30Var) {
        Objects.requireNonNull(v30Var.f16553b);
        return new oi4(v30Var, this.f12138a, this.f12140c, le4.f11547a, this.f12141d, this.f12139b, null);
    }
}
