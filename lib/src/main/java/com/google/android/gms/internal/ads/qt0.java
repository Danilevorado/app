package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class qt0 implements g20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14472a;

    /* renamed from: b, reason: collision with root package name */
    private final jj f14473b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f14474c;

    public qt0(Context context, jj jjVar) {
        this.f14472a = context;
        this.f14473b = jjVar;
        this.f14474c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.g20
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(tt0 tt0Var) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        mj mjVar = tt0Var.f16028f;
        if (mjVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f14473b.d() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z10 = mjVar.f12143a;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.f14473b.b()).put("activeViewJSON", this.f14473b.d()).put("timestamp", tt0Var.f16026d).put("adFormat", this.f14473b.a()).put("hashCode", this.f14473b.c()).put("isMraid", false).put("isStopped", false).put("isPaused", tt0Var.f16024b).put("isNative", this.f14473b.e()).put("isScreenOn", this.f14474c.isInteractive()).put("appMuted", j3.t.t().e()).put("appVolume", j3.t.t().a()).put("deviceVolume", m3.c.b(this.f14472a.getApplicationContext()));
            if (((Boolean) k3.w.c().b(ir.f10049p5)).booleanValue()) {
                AudioManager audioManager = (AudioManager) this.f14472a.getApplicationContext().getSystemService("audio");
                Integer numValueOf = audioManager == null ? null : Integer.valueOf(audioManager.getMode());
                if (numValueOf != null) {
                    jSONObject3.put("audioMode", numValueOf);
                }
            }
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f14472a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", mjVar.f12144b).put("isAttachedToWindow", z10).put("viewBox", new JSONObject().put("top", mjVar.f12145c.top).put("bottom", mjVar.f12145c.bottom).put("left", mjVar.f12145c.left).put("right", mjVar.f12145c.right)).put("adBox", new JSONObject().put("top", mjVar.f12146d.top).put("bottom", mjVar.f12146d.bottom).put("left", mjVar.f12146d.left).put("right", mjVar.f12146d.right)).put("globalVisibleBox", new JSONObject().put("top", mjVar.f12147e.top).put("bottom", mjVar.f12147e.bottom).put("left", mjVar.f12147e.left).put("right", mjVar.f12147e.right)).put("globalVisibleBoxVisible", mjVar.f12148f).put("localVisibleBox", new JSONObject().put("top", mjVar.f12149g.top).put("bottom", mjVar.f12149g.bottom).put("left", mjVar.f12149g.left).put("right", mjVar.f12149g.right)).put("localVisibleBoxVisible", mjVar.f12150h).put("hitBox", new JSONObject().put("top", mjVar.f12151i.top).put("bottom", mjVar.f12151i.bottom).put("left", mjVar.f12151i.left).put("right", mjVar.f12151i.right)).put("screenDensity", this.f14472a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", tt0Var.f16023a);
            if (((Boolean) k3.w.c().b(ir.f9991k1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = mjVar.f12153k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(tt0Var.f16027e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
