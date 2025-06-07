package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class k60 extends n60 {

    /* renamed from: c, reason: collision with root package name */
    private final Map f10843c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f10844d;

    public k60(nk0 nk0Var, Map map) {
        super(nk0Var, "storePicture");
        this.f10843c = map;
        this.f10844d = nk0Var.i();
    }

    public final void i() throws JSONException {
        if (this.f10844d == null) {
            c("Activity context is not available");
            return;
        }
        j3.t.r();
        if (!new rq(this.f10844d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f10843c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            c("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        j3.t.r();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesD = j3.t.q().d();
        j3.t.r();
        AlertDialog.Builder builderF = m3.b2.f(this.f10844d);
        builderF.setTitle(resourcesD != null ? resourcesD.getString(i3.b.f24297k) : "Save image");
        builderF.setMessage(resourcesD != null ? resourcesD.getString(i3.b.f24298l) : "Allow Ad to store image in Picture gallery?");
        builderF.setPositiveButton(resourcesD != null ? resourcesD.getString(i3.b.f24299m) : "Accept", new i60(this, str, lastPathSegment));
        builderF.setNegativeButton(resourcesD != null ? resourcesD.getString(i3.b.f24300n) : "Decline", new j60(this));
        builderF.create().show();
    }
}
