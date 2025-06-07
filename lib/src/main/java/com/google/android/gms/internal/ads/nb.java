package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class nb {

    /* renamed from: a, reason: collision with root package name */
    private final int f12566a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12567b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12568c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f12569d;

    public nb(int i10, List list, int i11, InputStream inputStream) {
        this.f12566a = i10;
        this.f12567b = list;
        this.f12568c = i11;
        this.f12569d = inputStream;
    }

    public final int a() {
        return this.f12568c;
    }

    public final int b() {
        return this.f12566a;
    }

    public final InputStream c() {
        InputStream inputStream = this.f12569d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List d() {
        return Collections.unmodifiableList(this.f12567b);
    }
}
