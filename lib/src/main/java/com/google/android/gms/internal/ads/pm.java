package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class pm {

    /* renamed from: a, reason: collision with root package name */
    private final vm f13946a;

    /* renamed from: b, reason: collision with root package name */
    private final go f13947b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f13948c;

    private pm() {
        this.f13947b = ho.M();
        this.f13948c = false;
        this.f13946a = new vm();
    }

    public pm(vm vmVar) {
        this.f13947b = ho.M();
        this.f13946a = vmVar;
        this.f13948c = ((Boolean) k3.w.c().b(ir.A4)).booleanValue();
    }

    public static pm a() {
        return new pm();
    }

    private final synchronized String d(int i10) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f13947b.F(), Long.valueOf(j3.t.b().b()), Integer.valueOf(i10 - 1), Base64.encodeToString(((ho) this.f13947b.m()).x(), 3));
    }

    private final synchronized void e(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(d(i10).getBytes());
                } catch (IOException unused) {
                    m3.n1.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        m3.n1.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    m3.n1.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            m3.n1.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void f(int i10) {
        go goVar = this.f13947b;
        goVar.y();
        zq zqVar = ir.f9881a;
        List listB = k3.w.a().b();
        ArrayList arrayList = new ArrayList();
        Iterator it = listB.iterator();
        while (it.hasNext()) {
            for (String str : ((String) it.next()).split(",")) {
                try {
                    arrayList.add(Long.valueOf(str));
                } catch (NumberFormatException unused) {
                    m3.n1.k("Experiment ID is not a number");
                }
            }
        }
        goVar.w(arrayList);
        um umVar = new um(this.f13946a, ((ho) this.f13947b.m()).x(), null);
        int i11 = i10 - 1;
        umVar.a(i11);
        umVar.c();
        m3.n1.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    public final synchronized void b(om omVar) {
        if (this.f13948c) {
            try {
                omVar.a(this.f13947b);
            } catch (NullPointerException e5) {
                j3.t.q().u(e5, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i10) {
        if (this.f13948c) {
            if (((Boolean) k3.w.c().b(ir.B4)).booleanValue()) {
                e(i10);
            } else {
                f(i10);
            }
        }
    }
}
