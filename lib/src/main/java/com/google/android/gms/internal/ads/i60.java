package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import org.json.JSONException;

/* loaded from: classes.dex */
final class i60 implements DialogInterface.OnClickListener {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f9565m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f9566n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ k60 f9567o;

    i60(k60 k60Var, String str, String str2) {
        this.f9567o = k60Var;
        this.f9565m = str;
        this.f9566n = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        DownloadManager downloadManager = (DownloadManager) this.f9567o.f10844d.getSystemService("download");
        try {
            String str = this.f9565m;
            String str2 = this.f9566n;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            j3.t.r();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f9567o.c("Could not store picture.");
        }
    }
}
