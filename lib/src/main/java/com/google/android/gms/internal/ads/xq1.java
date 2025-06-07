package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class xq1 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17778a;

    /* renamed from: b, reason: collision with root package name */
    private SensorManager f17779b;

    /* renamed from: c, reason: collision with root package name */
    private Sensor f17780c;

    /* renamed from: d, reason: collision with root package name */
    private long f17781d;

    /* renamed from: e, reason: collision with root package name */
    private int f17782e;

    /* renamed from: f, reason: collision with root package name */
    private wq1 f17783f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f17784g;

    xq1(Context context) {
        this.f17778a = context;
    }

    public final void a() {
        synchronized (this) {
            if (this.f17784g) {
                SensorManager sensorManager = this.f17779b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this, this.f17780c);
                    m3.n1.k("Stopped listening for shake gestures.");
                }
                this.f17784g = false;
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) k3.w.c().b(ir.f10052p8)).booleanValue()) {
                if (this.f17779b == null) {
                    SensorManager sensorManager2 = (SensorManager) this.f17778a.getSystemService("sensor");
                    this.f17779b = sensorManager2;
                    if (sensorManager2 == null) {
                        ze0.g("Shake detection failed to initialize. Failed to obtain accelerometer.");
                        return;
                    }
                    this.f17780c = sensorManager2.getDefaultSensor(1);
                }
                if (!this.f17784g && (sensorManager = this.f17779b) != null && (sensor = this.f17780c) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f17781d = j3.t.b().a() - ((Integer) k3.w.c().b(ir.f10074r8)).intValue();
                    this.f17784g = true;
                    m3.n1.k("Listening for shake gestures.");
                }
            }
        }
    }

    public final void c(wq1 wq1Var) {
        this.f17783f = wq1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) k3.w.c().b(ir.f10052p8)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f5 = fArr[0] / 9.80665f;
            float f10 = fArr[1] / 9.80665f;
            float f11 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f5 * f5) + (f10 * f10) + (f11 * f11))) < ((Float) k3.w.c().b(ir.f10063q8)).floatValue()) {
                return;
            }
            long jA = j3.t.b().a();
            if (this.f17781d + ((Integer) k3.w.c().b(ir.f10074r8)).intValue() > jA) {
                return;
            }
            if (this.f17781d + ((Integer) k3.w.c().b(ir.f10085s8)).intValue() < jA) {
                this.f17782e = 0;
            }
            m3.n1.k("Shake detected.");
            this.f17781d = jA;
            int i10 = this.f17782e + 1;
            this.f17782e = i10;
            wq1 wq1Var = this.f17783f;
            if (wq1Var != null) {
                if (i10 == ((Integer) k3.w.c().b(ir.f10096t8)).intValue()) {
                    xp1 xp1Var = (xp1) wq1Var;
                    xp1Var.h(new up1(xp1Var), wp1.GESTURE);
                }
            }
        }
    }
}
