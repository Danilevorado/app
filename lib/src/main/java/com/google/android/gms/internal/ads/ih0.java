package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes.dex */
final class ih0 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f9746a;

    /* renamed from: c, reason: collision with root package name */
    private final Display f9748c;

    /* renamed from: f, reason: collision with root package name */
    private float[] f9751f;

    /* renamed from: g, reason: collision with root package name */
    private Handler f9752g;

    /* renamed from: h, reason: collision with root package name */
    private hh0 f9753h;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f9749d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    private final float[] f9750e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final Object f9747b = new Object();

    ih0(Context context) {
        this.f9746a = (SensorManager) context.getSystemService("sensor");
        this.f9748c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    final void a(hh0 hh0Var) {
        this.f9753h = hh0Var;
    }

    final void b() {
        if (this.f9752g != null) {
            return;
        }
        Sensor defaultSensor = this.f9746a.getDefaultSensor(11);
        if (defaultSensor == null) {
            ze0.d("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        b03 b03Var = new b03(handlerThread.getLooper());
        this.f9752g = b03Var;
        if (this.f9746a.registerListener(this, defaultSensor, 0, b03Var)) {
            return;
        }
        ze0.d("SensorManager.registerListener failed.");
        c();
    }

    final void c() {
        if (this.f9752g == null) {
            return;
        }
        this.f9746a.unregisterListener(this);
        this.f9752g.post(new gh0(this));
        this.f9752g = null;
    }

    final boolean d(float[] fArr) {
        synchronized (this.f9747b) {
            float[] fArr2 = this.f9751f;
            if (fArr2 == null) {
                return false;
            }
            System.arraycopy(fArr2, 0, fArr, 0, 9);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f9747b) {
            if (this.f9751f == null) {
                this.f9751f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f9749d, fArr);
        int rotation = this.f9748c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f9749d, 2, 129, this.f9750e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f9749d, 129, 130, this.f9750e);
        } else if (rotation != 3) {
            System.arraycopy(this.f9749d, 0, this.f9750e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f9749d, 130, 1, this.f9750e);
        }
        float[] fArr2 = this.f9750e;
        float f5 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f5;
        float f10 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f10;
        float f11 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f11;
        synchronized (this.f9747b) {
            System.arraycopy(this.f9750e, 0, this.f9751f, 0, 9);
        }
        hh0 hh0Var = this.f9753h;
        if (hh0Var != null) {
            hh0Var.a();
        }
    }
}
