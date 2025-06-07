package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class k03 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10763a = 67108864;

    /* renamed from: b, reason: collision with root package name */
    public static final ClipData f10764b = ClipData.newIntent("", new Intent());

    public static PendingIntent a(Context context, int i10, Intent intent, int i11, int i12) {
        boolean zB;
        String str;
        i33.f((i11 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        i33.f((i11 & 1) == 0 || b(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        i33.f((i11 & 2) == 0 || b(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        i33.f((i11 & 4) == 0 || b(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        i33.f((i11 & 128) == 0 || b(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        i33.f(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            zB = !b(i11, 67108864);
            str = "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.";
        } else {
            zB = b(i11, 67108864);
            str = "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.";
        }
        i33.f(zB, str);
        Intent intent2 = new Intent(intent);
        if (!b(i11, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f10764b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i11);
    }

    private static boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
