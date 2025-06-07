package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;

/* loaded from: classes.dex */
abstract class zb4 {

    /* renamed from: a, reason: collision with root package name */
    private static final AudioAttributes f18514a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int a(int i10, int i11) {
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(sv2.n(i12)).build(), f18514a)) {
                return i12;
            }
        }
        return 0;
    }

    public static int[] b() {
        z53 z53Var = new z53();
        c83 c83VarL = ac4.f6039e.keySet().l();
        while (c83VarL.hasNext()) {
            int iIntValue = ((Integer) c83VarL.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), f18514a)) {
                z53Var.g(Integer.valueOf(iIntValue));
            }
        }
        z53Var.g(2);
        Object[] array = z53Var.j().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            Objects.requireNonNull(obj);
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
