package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class qr {

    /* renamed from: d, reason: collision with root package name */
    String f14448d;

    /* renamed from: e, reason: collision with root package name */
    Context f14449e;

    /* renamed from: f, reason: collision with root package name */
    String f14450f;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f14452h;

    /* renamed from: i, reason: collision with root package name */
    private File f14453i;

    /* renamed from: a, reason: collision with root package name */
    final BlockingQueue f14445a = new ArrayBlockingQueue(100);

    /* renamed from: b, reason: collision with root package name */
    final LinkedHashMap f14446b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f14447c = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final HashSet f14451g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void c(qr qrVar) throws Throwable {
        while (true) {
            try {
                as asVar = (as) qrVar.f14445a.take();
                zr zrVarA = asVar.a();
                if (!TextUtils.isEmpty(zrVarA.b())) {
                    qrVar.g(qrVar.b(qrVar.f14446b, asVar.b()), zrVarA);
                }
            } catch (InterruptedException e5) {
                ze0.h("CsiReporter:reporter interrupted", e5);
                return;
            }
        }
    }

    private final void g(Map map, zr zrVar) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.f14448d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (zrVar != null) {
            StringBuilder sb2 = new StringBuilder(string);
            if (!TextUtils.isEmpty(zrVar.b())) {
                sb2.append("&it=");
                sb2.append(zrVar.b());
            }
            if (!TextUtils.isEmpty(zrVar.a())) {
                sb2.append("&blat=");
                sb2.append(zrVar.a());
            }
            string = sb2.toString();
        }
        if (!this.f14452h.get()) {
            j3.t.r();
            m3.b2.g(this.f14449e, this.f14450f, string);
            return;
        }
        File file = this.f14453i;
        if (file == null) {
            ze0.g("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e5) {
                        ze0.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    ze0.h("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                            ze0.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            ze0.h("CsiReporter: Cannot close file: sdk_csi_data.txt.", e12);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e13) {
            e = e13;
        }
    }

    public final wr a(String str) {
        wr wrVar = (wr) this.f14447c.get(str);
        return wrVar != null ? wrVar : wr.f17245a;
    }

    final Map b(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, a(str).a((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void d(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f14449e = context;
        this.f14450f = str;
        this.f14448d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f14452h = atomicBoolean;
        atomicBoolean.set(((Boolean) xs.f17798c.e()).booleanValue());
        if (this.f14452h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f14453i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f14446b.put((String) entry.getKey(), (String) entry.getValue());
        }
        of0.f13186a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pr
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                qr.c(this.f14028m);
            }
        });
        Map map2 = this.f14447c;
        wr wrVar = wr.f17246b;
        map2.put("action", wrVar);
        this.f14447c.put("ad_format", wrVar);
        this.f14447c.put("e", wr.f17247c);
    }

    public final void e(String str) throws Throwable {
        if (this.f14451g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f14450f);
        linkedHashMap.put("ue", str);
        g(b(this.f14446b, linkedHashMap), null);
    }

    public final boolean f(as asVar) {
        return this.f14445a.offer(asVar);
    }
}
