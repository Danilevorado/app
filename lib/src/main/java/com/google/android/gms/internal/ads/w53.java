package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class w53 {
    w53() {
    }

    static int b(int i10, int i11) {
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        if (i12 < 0) {
            return Integer.MAX_VALUE;
        }
        return i12;
    }

    public abstract w53 a(Object obj);
}
