package com.bumptech.glide;

import a2.a0;
import a2.b0;
import a2.m;
import a2.t;
import a2.v;
import a2.x;
import a2.y;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import b2.a;
import com.bumptech.glide.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import g2.p;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x1.a;
import x1.b;
import x1.d;
import x1.e;
import x1.f;
import x1.k;
import x1.r;
import x1.s;
import x1.t;
import x1.u;
import x1.v;
import x1.w;
import y1.a;
import y1.b;
import y1.c;
import y1.d;
import y1.e;

/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: x, reason: collision with root package name */
    private static volatile b f5326x;

    /* renamed from: y, reason: collision with root package name */
    private static volatile boolean f5327y;

    /* renamed from: m, reason: collision with root package name */
    private final t1.k f5328m;

    /* renamed from: n, reason: collision with root package name */
    private final u1.d f5329n;

    /* renamed from: o, reason: collision with root package name */
    private final v1.h f5330o;

    /* renamed from: p, reason: collision with root package name */
    private final d f5331p;

    /* renamed from: q, reason: collision with root package name */
    private final i f5332q;

    /* renamed from: r, reason: collision with root package name */
    private final u1.b f5333r;

    /* renamed from: s, reason: collision with root package name */
    private final p f5334s;

    /* renamed from: t, reason: collision with root package name */
    private final g2.d f5335t;

    /* renamed from: v, reason: collision with root package name */
    private final a f5337v;

    /* renamed from: u, reason: collision with root package name */
    private final List f5336u = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    private f f5338w = f.NORMAL;

    public interface a {
        j2.f build();
    }

    b(Context context, t1.k kVar, v1.h hVar, u1.d dVar, u1.b bVar, p pVar, g2.d dVar2, int i10, a aVar, Map map, List list, e eVar) {
        Class cls;
        r1.j yVar;
        r1.j hVar2;
        int i11;
        this.f5328m = kVar;
        this.f5329n = dVar;
        this.f5333r = bVar;
        this.f5330o = hVar;
        this.f5334s = pVar;
        this.f5335t = dVar2;
        this.f5337v = aVar;
        Resources resources = context.getResources();
        i iVar = new i();
        this.f5332q = iVar;
        iVar.o(new a2.k());
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 27) {
            iVar.o(new a2.p());
        }
        List listG = iVar.g();
        e2.a aVar2 = new e2.a(context, listG, dVar, bVar);
        r1.j jVarH = b0.h(dVar);
        m mVar = new m(iVar.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i12 < 28 || !eVar.a(c.C0089c.class)) {
            a2.g gVar = new a2.g(mVar);
            cls = String.class;
            yVar = new y(mVar, bVar);
            hVar2 = gVar;
        } else {
            yVar = new t();
            hVar2 = new a2.h();
            cls = String.class;
        }
        if (i12 < 28 || !eVar.a(c.b.class)) {
            i11 = i12;
        } else {
            i11 = i12;
            iVar.e("Animation", InputStream.class, Drawable.class, c2.a.f(listG, bVar));
            iVar.e("Animation", ByteBuffer.class, Drawable.class, c2.a.a(listG, bVar));
        }
        c2.e eVar2 = new c2.e(context);
        r.c cVar = new r.c(resources);
        r.d dVar3 = new r.d(resources);
        r.b bVar2 = new r.b(resources);
        r.a aVar3 = new r.a(resources);
        a2.c cVar2 = new a2.c(bVar);
        f2.a aVar4 = new f2.a();
        f2.d dVar4 = new f2.d();
        ContentResolver contentResolver = context.getContentResolver();
        iVar.c(ByteBuffer.class, new x1.c()).c(InputStream.class, new s(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, hVar2).e("Bitmap", InputStream.class, Bitmap.class, yVar);
        if (ParcelFileDescriptorRewinder.c()) {
            iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar));
        }
        iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, jVarH).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, b0.c(dVar)).b(Bitmap.class, Bitmap.class, u.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new a0()).d(Bitmap.class, cVar2).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new a2.a(resources, hVar2)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new a2.a(resources, yVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new a2.a(resources, jVarH)).d(BitmapDrawable.class, new a2.b(dVar, cVar2)).e("Animation", InputStream.class, e2.c.class, new e2.j(listG, aVar2, bVar)).e("Animation", ByteBuffer.class, e2.c.class, aVar2).d(e2.c.class, new e2.d()).b(q1.a.class, q1.a.class, u.a.a()).e("Bitmap", q1.a.class, Bitmap.class, new e2.h(dVar)).a(Uri.class, Drawable.class, eVar2).a(Uri.class, Bitmap.class, new x(eVar2, dVar)).p(new a.C0077a()).b(File.class, ByteBuffer.class, new d.b()).b(File.class, InputStream.class, new f.e()).a(File.class, File.class, new d2.a()).b(File.class, ParcelFileDescriptor.class, new f.b()).b(File.class, File.class, u.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            iVar.p(new ParcelFileDescriptorRewinder.a());
        }
        Class cls2 = Integer.TYPE;
        Class cls3 = cls;
        iVar.b(cls2, InputStream.class, cVar).b(cls2, ParcelFileDescriptor.class, bVar2).b(Integer.class, InputStream.class, cVar).b(Integer.class, ParcelFileDescriptor.class, bVar2).b(Integer.class, Uri.class, dVar3).b(cls2, AssetFileDescriptor.class, aVar3).b(Integer.class, AssetFileDescriptor.class, aVar3).b(cls2, Uri.class, dVar3).b(cls3, InputStream.class, new e.c()).b(Uri.class, InputStream.class, new e.c()).b(cls3, InputStream.class, new t.c()).b(cls3, ParcelFileDescriptor.class, new t.b()).b(cls3, AssetFileDescriptor.class, new t.a()).b(Uri.class, InputStream.class, new a.c(context.getAssets())).b(Uri.class, AssetFileDescriptor.class, new a.b(context.getAssets())).b(Uri.class, InputStream.class, new b.a(context)).b(Uri.class, InputStream.class, new c.a(context));
        if (i11 >= 29) {
            iVar.b(Uri.class, InputStream.class, new d.c(context));
            iVar.b(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        iVar.b(Uri.class, InputStream.class, new v.d(contentResolver)).b(Uri.class, ParcelFileDescriptor.class, new v.b(contentResolver)).b(Uri.class, AssetFileDescriptor.class, new v.a(contentResolver)).b(Uri.class, InputStream.class, new w.a()).b(URL.class, InputStream.class, new e.a()).b(Uri.class, File.class, new k.a(context)).b(x1.g.class, InputStream.class, new a.C0213a()).b(byte[].class, ByteBuffer.class, new b.a()).b(byte[].class, InputStream.class, new b.d()).b(Uri.class, Uri.class, u.a.a()).b(Drawable.class, Drawable.class, u.a.a()).a(Drawable.class, Drawable.class, new c2.f()).q(Bitmap.class, BitmapDrawable.class, new f2.b(resources)).q(Bitmap.class, byte[].class, aVar4).q(Drawable.class, byte[].class, new f2.c(dVar, aVar4, dVar4)).q(e2.c.class, byte[].class, dVar4);
        r1.j jVarD = b0.d(dVar);
        iVar.a(ByteBuffer.class, Bitmap.class, jVarD);
        iVar.a(ByteBuffer.class, BitmapDrawable.class, new a2.a(resources, jVarD));
        this.f5331p = new d(context, bVar, iVar, new k2.f(), aVar, map, list, kVar, eVar, i10);
    }

    private static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f5327y) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f5327y = true;
        m(context, generatedAppGlideModule);
        f5327y = false;
    }

    public static b c(Context context) {
        if (f5326x == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (b.class) {
                if (f5326x == null) {
                    a(context, generatedAppGlideModuleD);
                }
            }
        }
        return f5326x;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e5) {
            e = e5;
            q(e);
            return null;
        } catch (InstantiationException e10) {
            e = e10;
            q(e);
            return null;
        } catch (NoSuchMethodException e11) {
            e = e11;
            q(e);
            return null;
        } catch (InvocationTargetException e12) {
            e = e12;
            q(e);
            return null;
        }
    }

    private static p l(Context context) {
        n2.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<h2.b> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listEmptyList = new h2.d(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set setD = generatedAppGlideModule.d();
            Iterator it = listEmptyList.iterator();
            while (it.hasNext()) {
                h2.b bVar = (h2.b) it.next();
                if (setD.contains(bVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + bVar);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((h2.b) it2.next()).getClass());
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            ((h2.b) it3.next()).a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b bVarA = cVar.a(applicationContext);
        for (h2.b bVar2 : listEmptyList) {
            try {
                bVar2.b(applicationContext, bVarA, bVarA.f5332q);
            } catch (AbstractMethodError e5) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar2.getClass().getName(), e5);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, bVarA, bVarA.f5332q);
        }
        applicationContext.registerComponentCallbacks(bVarA);
        f5326x = bVarA;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k t(Activity activity) {
        return l(activity).e(activity);
    }

    public static k u(Context context) {
        return l(context).f(context);
    }

    public void b() {
        n2.l.a();
        this.f5330o.b();
        this.f5329n.b();
        this.f5333r.b();
    }

    public u1.b e() {
        return this.f5333r;
    }

    public u1.d f() {
        return this.f5329n;
    }

    g2.d g() {
        return this.f5335t;
    }

    public Context h() {
        return this.f5331p.getBaseContext();
    }

    d i() {
        return this.f5331p;
    }

    public i j() {
        return this.f5332q;
    }

    public p k() {
        return this.f5334s;
    }

    void o(k kVar) {
        synchronized (this.f5336u) {
            if (this.f5336u.contains(kVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.f5336u.add(kVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        r(i10);
    }

    boolean p(k2.h hVar) {
        synchronized (this.f5336u) {
            Iterator it = this.f5336u.iterator();
            while (it.hasNext()) {
                if (((k) it.next()).x(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void r(int i10) {
        n2.l.a();
        synchronized (this.f5336u) {
            Iterator it = this.f5336u.iterator();
            while (it.hasNext()) {
                ((k) it.next()).onTrimMemory(i10);
            }
        }
        this.f5330o.a(i10);
        this.f5329n.a(i10);
        this.f5333r.a(i10);
    }

    void s(k kVar) {
        synchronized (this.f5336u) {
            if (!this.f5336u.contains(kVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f5336u.remove(kVar);
        }
    }
}
