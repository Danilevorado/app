package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hp1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9331a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f9332b;

    /* renamed from: e, reason: collision with root package name */
    private String f9335e = "";

    /* renamed from: c, reason: collision with root package name */
    private final int f9333c = ((Integer) k3.w.c().b(ir.f10151y8)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final int f9334d = ((Integer) k3.w.c().b(ir.f10162z8)).intValue();

    public hp1(Context context) {
        this.f9331a = context;
        this.f9332b = context.getApplicationInfo();
    }

    public final JSONObject a() throws JSONException {
        Drawable drawable;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", k4.c.a(this.f9331a).d(this.f9332b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f9332b.packageName);
        j3.t.r();
        jSONObject.put("adMobAppId", m3.b2.J(this.f9331a));
        if (this.f9335e.isEmpty()) {
            try {
                drawable = (Drawable) k4.c.a(this.f9331a).e(this.f9332b.packageName).f2364b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f9333c, this.f9334d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f9333c, this.f9334d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f9335e = strEncodeToString;
        }
        if (!this.f9335e.isEmpty()) {
            jSONObject.put("icon", this.f9335e);
            jSONObject.put("iconWidthPx", this.f9333c);
            jSONObject.put("iconHeightPx", this.f9334d);
        }
        return jSONObject;
    }
}
