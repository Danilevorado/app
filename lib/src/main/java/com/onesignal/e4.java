package com.onesignal;

import android.content.Context;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.onesignal.e3;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
class e4 {

    /* renamed from: a, reason: collision with root package name */
    private Context f21966a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21967b;

    /* renamed from: c, reason: collision with root package name */
    private b f21968c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21969d;

    /* renamed from: e, reason: collision with root package name */
    private Object f21970e;

    /* renamed from: f, reason: collision with root package name */
    private Field f21971f;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PurchasingService.registerListener(e4.this.f21966a, e4.this.f21968c);
        }
    }

    private class b implements PurchasingListener {

        /* renamed from: a, reason: collision with root package name */
        PurchasingListener f21973a;

        private b() {
        }

        /* synthetic */ b(e4 e4Var, a aVar) {
            this();
        }
    }

    e4(Context context) throws NoSuchFieldException, ClassNotFoundException {
        this.f21967b = false;
        this.f21969d = false;
        this.f21966a = context;
        try {
            Class<?> cls = Class.forName("com.amazon.device.iap.internal.d");
            a aVar = null;
            try {
                this.f21970e = cls.getMethod("d", new Class[0]).invoke(null, new Object[0]);
            } catch (NullPointerException unused) {
                this.f21970e = cls.getMethod("e", new Class[0]).invoke(null, new Object[0]);
                this.f21969d = true;
            }
            Field declaredField = cls.getDeclaredField("f");
            this.f21971f = declaredField;
            declaredField.setAccessible(true);
            b bVar = new b(this, aVar);
            this.f21968c = bVar;
            bVar.f21973a = (PurchasingListener) this.f21971f.get(this.f21970e);
            this.f21967b = true;
            e();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e5) {
            d(e5);
        }
    }

    private static void d(Exception exc) {
        e3.b(e3.z.ERROR, "Error adding Amazon IAP listener.", exc);
        exc.printStackTrace();
    }

    private void e() {
        if (this.f21969d) {
            OSUtils.S(new a());
        } else {
            PurchasingService.registerListener(this.f21966a, this.f21968c);
        }
    }

    void c() {
        if (this.f21967b) {
            try {
                PurchasingListener purchasingListener = (PurchasingListener) this.f21971f.get(this.f21970e);
                b bVar = this.f21968c;
                if (purchasingListener != bVar) {
                    bVar.f21973a = purchasingListener;
                    e();
                }
            } catch (IllegalAccessException e5) {
                e5.printStackTrace();
            }
        }
    }
}
