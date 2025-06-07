package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zh extends ui {

    /* renamed from: i, reason: collision with root package name */
    private final eh f18588i;

    public zh(dh dhVar, String str, String str2, xc xcVar, int i10, int i11, eh ehVar) {
        super(dhVar, "fyLPA28mp7uPyBOReRADDijv3FZ1tUGnt5ZGr7JsU06e7RVIoG/wHKNRMf3WJSQe", "soiTax1jBnD3649O45Tb84AswyowGJo3bnB66jWq5Kw=", xcVar, i10, 85);
        this.f18588i = ehVar;
    }

    @Override // com.google.android.gms.internal.ads.ui
    protected final void a() {
        long[] jArr = (long[]) this.f16346f.invoke(null, Long.valueOf(this.f18588i.d()), Long.valueOf(this.f18588i.h()), Long.valueOf(this.f18588i.b()), Long.valueOf(this.f18588i.f()));
        synchronized (this.f16345e) {
            this.f16345e.x0(jArr[0]);
            this.f16345e.w0(jArr[1]);
        }
    }
}
