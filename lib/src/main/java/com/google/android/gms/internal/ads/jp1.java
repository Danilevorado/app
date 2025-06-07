package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public final class jp1 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f10659a;

    /* renamed from: b, reason: collision with root package name */
    private final Sensor f10660b;

    /* renamed from: c, reason: collision with root package name */
    private float f10661c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private Float f10662d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    private long f10663e = j3.t.b().a();

    /* renamed from: f, reason: collision with root package name */
    private int f10664f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f10665g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10666h = false;

    /* renamed from: i, reason: collision with root package name */
    private ip1 f10667i = null;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10668j = false;

    jp1(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f10659a = sensorManager;
        if (sensorManager != null) {
            this.f10660b = sensorManager.getDefaultSensor(4);
        } else {
            this.f10660b = null;
        }
    }

    public final void a() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.f10668j && (sensorManager = this.f10659a) != null && (sensor = this.f10660b) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.f10668j = false;
                m3.n1.k("Stopped listening for flick gestures.");
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (((Boolean) k3.w.c().b(ir.f10107u8)).booleanValue()) {
                if (!this.f10668j && (sensorManager = this.f10659a) != null && (sensor = this.f10660b) != null) {
                    sensorManager.registerListener(this, sensor, 2);
                    this.f10668j = true;
                    m3.n1.k("Listening for flick gestures.");
                }
                if (this.f10659a == null || this.f10660b == null) {
                    ze0.g("Flick detection failed to initialize. Failed to obtain gyroscope.");
                }
            }
        }
    }

    public final void c(ip1 ip1Var) {
        this.f10667i = ip1Var;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (((Boolean) k3.w.c().b(ir.f10107u8)).booleanValue()) {
            long jA = j3.t.b().a();
            if (this.f10663e + ((Integer) k3.w.c().b(ir.f10129w8)).intValue() < jA) {
                this.f10664f = 0;
                this.f10663e = jA;
                this.f10665g = false;
                this.f10666h = false;
                this.f10661c = this.f10662d.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f10662d.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f10662d = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f5 = this.f10661c;
            zq zqVar = ir.f10118v8;
            if (fFloatValue > f5 + ((Float) k3.w.c().b(zqVar)).floatValue()) {
                this.f10661c = this.f10662d.floatValue();
                this.f10666h = true;
            } else if (this.f10662d.floatValue() < this.f10661c - ((Float) k3.w.c().b(zqVar)).floatValue()) {
                this.f10661c = this.f10662d.floatValue();
                this.f10665g = true;
            }
            if (this.f10662d.isInfinite()) {
                this.f10662d = Float.valueOf(0.0f);
                this.f10661c = 0.0f;
            }
            if (this.f10665g && this.f10666h) {
                m3.n1.k("Flick detected.");
                this.f10663e = jA;
                int i10 = this.f10664f + 1;
                this.f10664f = i10;
                this.f10665g = false;
                this.f10666h = false;
                ip1 ip1Var = this.f10667i;
                if (ip1Var != null) {
                    if (i10 == ((Integer) k3.w.c().b(ir.f10140x8)).intValue()) {
                        xp1 xp1Var = (xp1) ip1Var;
                        xp1Var.h(new vp1(xp1Var), wp1.GESTURE);
                    }
                }
            }
        }
    }
}
