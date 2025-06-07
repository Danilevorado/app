package n1;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.blikoon.qrcodescanner.QrCodeActivity;
import r6.k;

/* loaded from: classes.dex */
public final class a extends Handler {

    /* renamed from: d, reason: collision with root package name */
    private static final String f25452d = a.class.getName();

    /* renamed from: a, reason: collision with root package name */
    private final QrCodeActivity f25453a;

    /* renamed from: b, reason: collision with root package name */
    private final f f25454b;

    /* renamed from: c, reason: collision with root package name */
    private EnumC0165a f25455c;

    /* renamed from: n1.a$a, reason: collision with other inner class name */
    private enum EnumC0165a {
        PREVIEW,
        SUCCESS,
        DONE
    }

    public a(QrCodeActivity qrCodeActivity) {
        this.f25453a = qrCodeActivity;
        f fVar = new f(qrCodeActivity);
        this.f25454b = fVar;
        fVar.start();
        this.f25455c = EnumC0165a.SUCCESS;
        b();
    }

    public void a() {
        this.f25455c = EnumC0165a.DONE;
        m1.c.b().i();
        Message.obtain(this.f25454b.a(), l1.d.f25033m).sendToTarget();
        try {
            this.f25454b.join();
        } catch (InterruptedException unused) {
        }
        removeMessages(l1.d.f25024d);
        removeMessages(l1.d.f25023c);
    }

    public void b() {
        EnumC0165a enumC0165a = this.f25455c;
        EnumC0165a enumC0165a2 = EnumC0165a.PREVIEW;
        if (enumC0165a != enumC0165a2) {
            m1.c.b().h();
            this.f25455c = enumC0165a2;
            m1.c.b().f(this.f25454b.a(), l1.d.f25022b);
            m1.c.b().e(this, l1.d.f25021a);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws IllegalStateException {
        int i10 = message.what;
        int i11 = l1.d.f25021a;
        if (i10 == i11) {
            Log.d(f25452d, "Got auto-focus message");
            if (this.f25455c == EnumC0165a.PREVIEW) {
                m1.c.b().e(this, i11);
                return;
            }
            return;
        }
        if (i10 == l1.d.f25024d) {
            Log.e(f25452d, "Got decode succeeded message");
            this.f25455c = EnumC0165a.SUCCESS;
            this.f25453a.h((k) message.obj);
        } else if (i10 == l1.d.f25023c) {
            this.f25455c = EnumC0165a.PREVIEW;
            m1.c.b().f(this.f25454b.a(), l1.d.f25022b);
        }
    }
}
