package com.google.firebase.installations;

/* loaded from: classes.dex */
public class d extends v5.i {

    /* renamed from: m, reason: collision with root package name */
    private final a f21376m;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f21376m = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f21376m = aVar;
    }
}
