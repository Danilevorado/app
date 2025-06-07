package c4;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class a extends Exception {

    /* renamed from: m, reason: collision with root package name */
    protected final Status f4669m;

    public a(Status status) {
        super(status.h() + ": " + (status.v() != null ? status.v() : ""));
        this.f4669m = status;
    }

    public Status a() {
        return this.f4669m;
    }

    public int b() {
        return this.f4669m.h();
    }
}
