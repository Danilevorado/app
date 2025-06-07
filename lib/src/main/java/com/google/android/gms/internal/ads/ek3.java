package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
abstract /* synthetic */ class ek3 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f7865a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f7866b;

    static {
        int[] iArr = new int[ms3.values().length];
        f7866b = iArr;
        try {
            iArr[ms3.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7866b[ms3.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[ut3.values().length];
        f7865a = iArr2;
        try {
            iArr2[ut3.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7865a[ut3.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f7865a[ut3.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f7865a[ut3.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
