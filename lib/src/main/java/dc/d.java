package dc;

import android.content.Context;
import android.util.Log;
import dc.c;
import ec.i;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    protected final Set f22988a;

    /* renamed from: b, reason: collision with root package name */
    protected final c.b f22989b;

    /* renamed from: c, reason: collision with root package name */
    protected final c.a f22990c;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f22991d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f22992e;

    /* renamed from: f, reason: collision with root package name */
    protected c.d f22993f;

    class a implements Runnable {

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f22994m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f22995n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f22996o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ c.InterfaceC0120c f22997p;

        a(Context context, String str, String str2, c.InterfaceC0120c interfaceC0120c) {
            this.f22994m = context;
            this.f22995n = str;
            this.f22996o = str2;
            this.f22997p = interfaceC0120c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d.this.g(this.f22994m, this.f22995n, this.f22996o);
                this.f22997p.b();
            } catch (dc.b | UnsatisfiedLinkError e5) {
                this.f22997p.a(e5);
            }
        }
    }

    class b implements FilenameFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f22999a;

        b(String str) {
            this.f22999a = str;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(this.f22999a);
        }
    }

    protected d() {
        this(new e(), new dc.a());
    }

    protected d(c.b bVar, c.a aVar) {
        this.f22988a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
        this.f22989b = bVar;
        this.f22990c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(Context context, String str, String str2) throws Throwable {
        i iVar;
        if (this.f22988a.contains(str) && !this.f22991d) {
            i("%s already loaded previously!", str);
            return;
        }
        try {
            this.f22989b.c(str);
            this.f22988a.add(str);
            i("%s (%s) was loaded normally!", str, str2);
        } catch (UnsatisfiedLinkError e5) {
            i("Loading the library normally failed: %s", Log.getStackTraceString(e5));
            i("%s (%s) was not loaded normally, re-linking...", str, str2);
            File fileD = d(context, str, str2);
            if (!fileD.exists() || this.f22991d) {
                if (this.f22991d) {
                    i("Forcing a re-link of %s (%s)...", str, str2);
                }
                b(context, str, str2);
                this.f22990c.a(context, this.f22989b.d(), this.f22989b.a(str), fileD, this);
            }
            try {
                if (this.f22992e) {
                    i iVar2 = null;
                    try {
                        iVar = new i(fileD);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        List listE = iVar.e();
                        iVar.close();
                        Iterator it = listE.iterator();
                        while (it.hasNext()) {
                            e(context, this.f22989b.b((String) it.next()));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        iVar2 = iVar;
                        iVar2.close();
                        throw th;
                    }
                }
            } catch (IOException unused) {
            }
            this.f22989b.e(fileD.getAbsolutePath());
            this.f22988a.add(str);
            i("%s (%s) was re-linked!", str, str2);
        }
    }

    protected void b(Context context, String str, String str2) {
        File fileC = c(context);
        File fileD = d(context, str, str2);
        File[] fileArrListFiles = fileC.listFiles(new b(this.f22989b.a(str)));
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f22991d || !file.getAbsolutePath().equals(fileD.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    protected File c(Context context) {
        return context.getDir("lib", 0);
    }

    protected File d(Context context, String str, String str2) {
        String strA = this.f22989b.a(str);
        if (f.a(str2)) {
            return new File(c(context), strA);
        }
        return new File(c(context), strA + "." + str2);
    }

    public void e(Context context, String str) {
        f(context, str, null, null);
    }

    public void f(Context context, String str, String str2, c.InterfaceC0120c interfaceC0120c) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (f.a(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        i("Beginning load of %s...", str);
        if (interfaceC0120c == null) {
            g(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, interfaceC0120c)).start();
        }
    }

    public void h(String str) {
        c.d dVar = this.f22993f;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public void i(String str, Object... objArr) {
        h(String.format(Locale.US, str, objArr));
    }
}
