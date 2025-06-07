package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class li extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final StackTraceElement[] f11609i;

    public li(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(dhVar, "FZw69K6puYJxxRxEPnIcPhNWMb6KJOCrIG9Jmt7OCzqsABzt6hhEAApiISZy7jIX", "bNQyCiIh4bApN5OPBGky2u9xZmVV2JI0QXAUD4Niu0E=", xcVar, i10, 45);
        this.f11609i = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        StackTraceElement[] stackTraceElementArr = this.f11609i;
        if (stackTraceElementArr != null) {
            ug ugVar = new ug((String) this.f16346f.invoke(null, stackTraceElementArr));
            synchronized (this.f16345e) {
                this.f16345e.A(ugVar.f16323b.longValue());
                if (ugVar.f16324c.booleanValue()) {
                    this.f16345e.Y(true != ugVar.f16325d.booleanValue() ? 2 : 1);
                } else {
                    this.f16345e.Y(3);
                }
            }
        }
    }
}
