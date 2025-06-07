package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class f60 extends n60 {

    /* renamed from: c, reason: collision with root package name */
    private final Map f8130c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f8131d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8132e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8133f;

    /* renamed from: g, reason: collision with root package name */
    private final long f8134g;

    /* renamed from: h, reason: collision with root package name */
    private final String f8135h;

    /* renamed from: i, reason: collision with root package name */
    private final String f8136i;

    public f60(nk0 nk0Var, Map map) {
        super(nk0Var, "createCalendarEvent");
        this.f8130c = map;
        this.f8131d = nk0Var.i();
        this.f8132e = l("description");
        this.f8135h = l("summary");
        this.f8133f = k("start_ticks");
        this.f8134g = k("end_ticks");
        this.f8136i = l("location");
    }

    private final long k(String str) {
        String str2 = (String) this.f8130c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String l(String str) {
        return TextUtils.isEmpty((CharSequence) this.f8130c.get(str)) ? "" : (String) this.f8130c.get(str);
    }

    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f8132e);
        data.putExtra("eventLocation", this.f8136i);
        data.putExtra("description", this.f8135h);
        long j10 = this.f8133f;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.f8134g;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() throws JSONException {
        if (this.f8131d == null) {
            c("Activity context is not available.");
            return;
        }
        j3.t.r();
        if (!new rq(this.f8131d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        j3.t.r();
        AlertDialog.Builder builderF = m3.b2.f(this.f8131d);
        Resources resourcesD = j3.t.q().d();
        builderF.setTitle(resourcesD != null ? resourcesD.getString(i3.b.f24301o) : "Create calendar event");
        builderF.setMessage(resourcesD != null ? resourcesD.getString(i3.b.f24302p) : "Allow Ad to create a calendar event?");
        builderF.setPositiveButton(resourcesD != null ? resourcesD.getString(i3.b.f24299m) : "Accept", new d60(this));
        builderF.setNegativeButton(resourcesD != null ? resourcesD.getString(i3.b.f24300n) : "Decline", new e60(this));
        builderF.create().show();
    }
}
