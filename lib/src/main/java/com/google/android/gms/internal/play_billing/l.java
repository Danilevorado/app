package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    Object[] f19567a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    int f19568b = 0;

    /* renamed from: c, reason: collision with root package name */
    k f19569c;

    public final l a(Object obj, Object obj2) {
        int i10 = this.f19568b + 1;
        Object[] objArr = this.f19567a;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f19567a = Arrays.copyOf(objArr, i12);
        }
        e.a(obj, obj2);
        Object[] objArr2 = this.f19567a;
        int i13 = this.f19568b;
        int i14 = i13 + i13;
        objArr2[i14] = obj;
        objArr2[i14 + 1] = obj2;
        this.f19568b = i13 + 1;
        return this;
    }

    public final m b() {
        k kVar = this.f19569c;
        if (kVar != null) {
            throw kVar.a();
        }
        u uVarG = u.g(this.f19568b, this.f19567a, this);
        k kVar2 = this.f19569c;
        if (kVar2 == null) {
            return uVarG;
        }
        throw kVar2.a();
    }
}
