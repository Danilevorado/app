package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
abstract class ad4 {
    public static void a(AudioTrack audioTrack, cd4 cd4Var) {
        audioTrack.setPreferredDevice(cd4Var == null ? null : cd4Var.f6882a);
    }
}
