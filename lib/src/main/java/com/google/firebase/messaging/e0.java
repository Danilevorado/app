package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class e0 implements Closeable {

    /* renamed from: m, reason: collision with root package name */
    private final URL f21477m;

    /* renamed from: n, reason: collision with root package name */
    private volatile Future f21478n;

    /* renamed from: o, reason: collision with root package name */
    private b5.i f21479o;

    private e0(URL url) {
        this.f21477m = url;
    }

    private byte[] e() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f21477m.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            byte[] bArrD = b.d(b.b(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                Log.v("FirebaseMessaging", "Downloaded " + bArrD.length + " bytes from " + this.f21477m);
            }
            if (bArrD.length <= 1048576) {
                return bArrD;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static e0 f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new e0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(b5.j jVar) {
        try {
            jVar.c(c());
        } catch (Exception e5) {
            jVar.b(e5);
        }
    }

    public Bitmap c() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f21477m);
        }
        byte[] bArrE = e();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrE, 0, bArrE.length);
        if (bitmapDecodeByteArray == null) {
            throw new IOException("Failed to decode image: " + this.f21477m);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f21477m);
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21478n.cancel(true);
    }

    public b5.i g() {
        return (b5.i) e4.p.l(this.f21479o);
    }

    public void x(ExecutorService executorService) {
        final b5.j jVar = new b5.j();
        this.f21478n = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f21469m.s(jVar);
            }
        });
        this.f21479o = jVar.a();
    }
}
