package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes.dex */
abstract class om4 {
    public static void a(Surface surface, float f5) {
        try {
            surface.setFrameRate(f5, f5 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e5) {
            ad2.c("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e5);
        }
    }
}
