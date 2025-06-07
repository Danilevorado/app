package com.blikoon.qrcodescanner;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.blikoon.qrcodescanner.view.QrCodeFinderView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import l1.f;
import l1.g;
import n1.e;
import n1.h;
import r6.k;

/* loaded from: classes.dex */
public class QrCodeActivity extends Activity implements SurfaceHolder.Callback, View.OnClickListener {
    private Executor A;
    private Handler B;
    private Context F;

    /* renamed from: m, reason: collision with root package name */
    private n1.a f5293m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f5294n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f5295o;

    /* renamed from: p, reason: collision with root package name */
    private h f5296p;

    /* renamed from: q, reason: collision with root package name */
    private QrCodeFinderView f5297q;

    /* renamed from: r, reason: collision with root package name */
    private SurfaceView f5298r;

    /* renamed from: s, reason: collision with root package name */
    private View f5299s;

    /* renamed from: u, reason: collision with root package name */
    private MediaPlayer f5301u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f5302v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5303w;

    /* renamed from: y, reason: collision with root package name */
    private ImageView f5305y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f5306z;

    /* renamed from: t, reason: collision with root package name */
    private final n1.e f5300t = new n1.e();

    /* renamed from: x, reason: collision with root package name */
    private boolean f5304x = true;
    private final String C = "com.blikoon.qrcodescanner.got_qr_scan_relult";
    private final String D = "com.blikoon.qrcodescanner.error_decoding_image";
    private final String E = "QRScannerQRCodeActivity";
    private final MediaPlayer.OnCompletionListener G = new b();
    private n1.c H = new d();

    class a implements e.d {
        a() {
        }

        @Override // n1.e.d
        public void a() {
            QrCodeActivity.this.y();
        }
    }

    class b implements MediaPlayer.OnCompletionListener {
        b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
            mediaPlayer.seekTo(0);
        }
    }

    class c implements e.d {
        c() {
        }

        @Override // n1.e.d
        public void a() {
            QrCodeActivity.this.y();
        }
    }

    class d implements n1.c {
        d() {
        }

        @Override // n1.c
        public void a(k kVar) {
            Log.d("QRScannerQRCodeActivity", "Decoded the image successfully :" + kVar.a());
            Intent intent = new Intent();
            intent.putExtra("com.blikoon.qrcodescanner.got_qr_scan_relult", kVar.a());
            QrCodeActivity.this.setResult(-1, intent);
            QrCodeActivity.this.finish();
        }

        @Override // n1.c
        public void b(int i10, String str) {
            Log.d("QRScannerQRCodeActivity", "Something went wrong decoding the image :" + str);
            Intent intent = new Intent();
            intent.putExtra("com.blikoon.qrcodescanner.error_decoding_image", str);
            QrCodeActivity.this.setResult(0, intent);
            QrCodeActivity.this.finish();
        }
    }

    private static class e extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference f5311a;

        /* renamed from: b, reason: collision with root package name */
        private n1.e f5312b = new n1.e();

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }

        public e(QrCodeActivity qrCodeActivity) {
            this.f5311a = new WeakReference(qrCodeActivity);
        }

        private void a(String str) {
            this.f5312b.d((QrCodeActivity) this.f5311a.get(), str, new a());
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void handleMessage(android.os.Message r4) {
            /*
                r3 = this;
                java.lang.ref.WeakReference r0 = r3.f5311a
                java.lang.Object r0 = r0.get()
                com.blikoon.qrcodescanner.QrCodeActivity r0 = (com.blikoon.qrcodescanner.QrCodeActivity) r0
                int r1 = r4.what
                r2 = 1
                if (r1 == r2) goto L17
                r2 = 2
                if (r1 == r2) goto L11
                goto L25
            L11:
                n1.e r1 = r3.f5312b
                r1.a(r0)
                goto L25
            L17:
                java.lang.Object r1 = r4.obj
                r6.k r1 = (r6.k) r1
                if (r1 != 0) goto L1e
                goto L11
            L1e:
                java.lang.String r0 = r1.a()
                r3.a(r0)
            L25:
                super.handleMessage(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.blikoon.qrcodescanner.QrCodeActivity.e.handleMessage(android.os.Message):void");
        }
    }

    private void A() {
        this.f5304x = false;
        this.f5306z.setText(getString(g.f25041e));
        this.f5305y.setBackgroundResource(l1.c.f25019a);
        m1.c.b().g(true);
    }

    private boolean b(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    private void c() {
        if (!b(this)) {
            this.f5295o = false;
            finish();
        } else {
            if (r()) {
                this.f5295o = true;
                return;
            }
            findViewById(l1.d.f25031k).setVisibility(0);
            this.f5297q.setVisibility(8);
            this.f5295o = false;
        }
    }

    private void q(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f5300t.b(this, new c());
            return;
        }
        Log.d("QRScannerQRCodeActivity", "Got scan result from user loaded image :" + str);
        Intent intent = new Intent();
        intent.putExtra("com.blikoon.qrcodescanner.got_qr_scan_relult", str);
        setResult(-1, intent);
        finish();
    }

    private boolean r() {
        return getPackageManager().checkPermission("android.permission.CAMERA", getPackageName()) == 0;
    }

    private void s() throws IllegalStateException, Resources.NotFoundException, IOException, IllegalArgumentException {
        if (this.f5302v && this.f5301u == null) {
            setVolumeControlStream(3);
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f5301u = mediaPlayer;
            mediaPlayer.setAudioStreamType(3);
            this.f5301u.setOnCompletionListener(this.G);
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = getResources().openRawResourceFd(f.f25036a);
            try {
                this.f5301u.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                this.f5301u.setVolume(0.1f, 0.1f);
                this.f5301u.prepare();
            } catch (IOException unused) {
                this.f5301u = null;
            }
        }
    }

    private void t(SurfaceHolder surfaceHolder) {
        try {
            m1.c.b().d(surfaceHolder);
            this.f5297q.setVisibility(0);
            this.f5298r.setVisibility(0);
            this.f5299s.setVisibility(0);
            findViewById(l1.d.f25031k).setVisibility(8);
            if (this.f5293m == null) {
                this.f5293m = new n1.a(this);
            }
        } catch (IOException unused) {
            Toast.makeText(this, getString(g.f25039c), 0).show();
            finish();
        } catch (RuntimeException e5) {
            e5.printStackTrace();
            this.f5300t.c(this);
        }
    }

    private void u() {
        m1.c.c(this);
        this.f5296p = new h(this);
        this.A = Executors.newSingleThreadExecutor();
        this.B = new e(this);
    }

    private void v() {
        TextView textView = (TextView) findViewById(l1.d.f25026f);
        this.f5305y = (ImageView) findViewById(l1.d.f25027g);
        this.f5306z = (TextView) findViewById(l1.d.f25030j);
        this.f5297q = (QrCodeFinderView) findViewById(l1.d.f25032l);
        this.f5298r = (SurfaceView) findViewById(l1.d.f25029i);
        this.f5299s = findViewById(l1.d.f25028h);
        this.f5294n = false;
        this.f5305y.setOnClickListener(this);
        textView.setOnClickListener(this);
    }

    private void w() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(intent, 0);
    }

    private void x() throws IllegalStateException {
        MediaPlayer mediaPlayer;
        if (this.f5302v && (mediaPlayer = this.f5301u) != null) {
            mediaPlayer.start();
        }
        if (this.f5303w) {
            ((Vibrator) getSystemService("vibrator")).vibrate(200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        n1.a aVar = this.f5293m;
        if (aVar != null) {
            aVar.b();
        }
    }

    private void z() {
        this.f5304x = true;
        this.f5306z.setText(getString(g.f25045i));
        this.f5305y.setBackgroundResource(l1.c.f25020b);
        m1.c.b().g(false);
    }

    public Handler d() {
        return this.f5293m;
    }

    public String f(Uri uri) {
        Cursor cursorQuery = getContentResolver().query(uri, null, null, null, null);
        cursorQuery.moveToFirst();
        String string = cursorQuery.getString(0);
        String strSubstring = string.substring(string.lastIndexOf(":") + 1);
        cursorQuery.close();
        Cursor cursorQuery2 = getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, "_id = ? ", new String[]{strSubstring}, null);
        cursorQuery2.moveToFirst();
        String string2 = cursorQuery2.getString(cursorQuery2.getColumnIndex("_data"));
        cursorQuery2.close();
        return string2;
    }

    public void h(k kVar) throws IllegalStateException {
        this.f5296p.b();
        x();
        if (kVar == null) {
            this.f5300t.b(this, new a());
        } else {
            q(kVar.a());
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        Executor executor;
        if (i11 != -1) {
            return;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                return;
            }
            finish();
        } else {
            String strF = f(intent.getData());
            if (strF == null || TextUtils.isEmpty(strF) || (executor = this.A) == null) {
                return;
            }
            executor.execute(new n1.d(strF, this.H));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == l1.d.f25027g) {
            if (this.f5304x) {
                A();
                return;
            } else {
                z();
                return;
            }
        }
        if (view.getId() == l1.d.f25026f) {
            if (r()) {
                w();
            } else {
                this.f5300t.c(this);
            }
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView(l1.e.f25034a);
        v();
        u();
        this.F = getApplicationContext();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        h hVar = this.f5296p;
        if (hVar != null) {
            hVar.c();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        n1.a aVar = this.f5293m;
        if (aVar != null) {
            aVar.a();
            this.f5293m = null;
        }
        m1.c.b().a();
    }

    @Override // android.app.Activity
    protected void onResume() throws IllegalStateException, Resources.NotFoundException, IOException, IllegalArgumentException {
        super.onResume();
        c();
        if (!this.f5295o) {
            this.f5300t.c(this);
            return;
        }
        SurfaceHolder holder = this.f5298r.getHolder();
        z();
        if (this.f5294n) {
            t(holder);
        } else {
            holder.addCallback(this);
            holder.setType(3);
        }
        this.f5302v = true;
        if (((AudioManager) getSystemService("audio")).getRingerMode() != 2) {
            this.f5302v = false;
        }
        s();
        this.f5303w = true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f5294n) {
            return;
        }
        this.f5294n = true;
        t(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f5294n = false;
    }
}
