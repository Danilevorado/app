package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class pg0 extends rg0 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    private static final Map E;
    private int A;
    private qg0 B;
    private boolean C;
    private Integer D;

    /* renamed from: o, reason: collision with root package name */
    private final lh0 f13875o;

    /* renamed from: p, reason: collision with root package name */
    private final mh0 f13876p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f13877q;

    /* renamed from: r, reason: collision with root package name */
    private int f13878r;

    /* renamed from: s, reason: collision with root package name */
    private int f13879s;

    /* renamed from: t, reason: collision with root package name */
    private MediaPlayer f13880t;

    /* renamed from: u, reason: collision with root package name */
    private Uri f13881u;

    /* renamed from: v, reason: collision with root package name */
    private int f13882v;

    /* renamed from: w, reason: collision with root package name */
    private int f13883w;

    /* renamed from: x, reason: collision with root package name */
    private int f13884x;

    /* renamed from: y, reason: collision with root package name */
    private jh0 f13885y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f13886z;

    static {
        HashMap map = new HashMap();
        E = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(701, "MEDIA_INFO_BUFFERING_START");
        map.put(702, "MEDIA_INFO_BUFFERING_END");
        map.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        map.put(802, "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public pg0(Context context, lh0 lh0Var, boolean z10, boolean z11, kh0 kh0Var, mh0 mh0Var) {
        super(context);
        this.f13878r = 0;
        this.f13879s = 0;
        this.C = false;
        this.D = null;
        setSurfaceTextureListener(this);
        this.f13875o = lh0Var;
        this.f13876p = mh0Var;
        this.f13886z = z10;
        this.f13877q = z11;
        mh0Var.a(this);
    }

    private final void E() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        m3.n1.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.f13881u == null || surfaceTexture == null) {
            return;
        }
        F(false);
        try {
            j3.t.m();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f13880t = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f13880t.setOnCompletionListener(this);
            this.f13880t.setOnErrorListener(this);
            this.f13880t.setOnInfoListener(this);
            this.f13880t.setOnPreparedListener(this);
            this.f13880t.setOnVideoSizeChangedListener(this);
            this.f13884x = 0;
            if (this.f13886z) {
                jh0 jh0Var = new jh0(getContext());
                this.f13885y = jh0Var;
                jh0Var.d(surfaceTexture, getWidth(), getHeight());
                this.f13885y.start();
                SurfaceTexture surfaceTextureB = this.f13885y.b();
                if (surfaceTextureB != null) {
                    surfaceTexture = surfaceTextureB;
                } else {
                    this.f13885y.e();
                    this.f13885y = null;
                }
            }
            this.f13880t.setDataSource(getContext(), this.f13881u);
            j3.t.n();
            this.f13880t.setSurface(new Surface(surfaceTexture));
            this.f13880t.setAudioStreamType(3);
            this.f13880t.setScreenOnWhilePlaying(true);
            this.f13880t.prepareAsync();
            G(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e5) {
            ze0.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.f13881u)), e5);
            onError(this.f13880t, 1, 0);
        }
    }

    private final void F(boolean z10) {
        m3.n1.k("AdMediaPlayerView release");
        jh0 jh0Var = this.f13885y;
        if (jh0Var != null) {
            jh0Var.e();
            this.f13885y = null;
        }
        MediaPlayer mediaPlayer = this.f13880t;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f13880t.release();
            this.f13880t = null;
            G(0);
            if (z10) {
                this.f13879s = 0;
            }
        }
    }

    private final void G(int i10) {
        if (i10 == 3) {
            this.f13876p.c();
            this.f14779n.b();
        } else if (this.f13878r == 3) {
            this.f13876p.e();
            this.f14779n.c();
        }
        this.f13878r = i10;
    }

    private final void H(float f5) {
        MediaPlayer mediaPlayer = this.f13880t;
        if (mediaPlayer == null) {
            ze0.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f5, f5);
            } catch (IllegalStateException unused) {
            }
        }
    }

    private final boolean I() {
        int i10;
        return (this.f13880t == null || (i10 = this.f13878r) == -1 || i10 == 0 || i10 == 1) ? false : true;
    }

    static /* bridge */ /* synthetic */ void L(pg0 pg0Var, MediaPlayer mediaPlayer) {
        MediaPlayer.TrackInfo[] trackInfo;
        String string;
        String str;
        MediaFormat format;
        if (!((Boolean) k3.w.c().b(ir.I1)).booleanValue() || pg0Var.f13875o == null || mediaPlayer == null || (trackInfo = mediaPlayer.getTrackInfo()) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (MediaPlayer.TrackInfo trackInfo2 : trackInfo) {
            if (trackInfo2 != null) {
                int trackType = trackInfo2.getTrackType();
                if (trackType == 1) {
                    MediaFormat format2 = trackInfo2.getFormat();
                    if (format2 != null) {
                        if (format2.containsKey("frame-rate")) {
                            try {
                                map.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                            } catch (ClassCastException unused) {
                                map.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                            }
                        }
                        if (format2.containsKey("bitrate")) {
                            Integer numValueOf = Integer.valueOf(format2.getInteger("bitrate"));
                            pg0Var.D = numValueOf;
                            map.put("bitRate", String.valueOf(numValueOf));
                        }
                        if (format2.containsKey("width") && format2.containsKey("height")) {
                            map.put("resolution", format2.getInteger("width") + "x" + format2.getInteger("height"));
                        }
                        if (format2.containsKey("mime")) {
                            map.put("videoMime", format2.getString("mime"));
                        }
                        if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                            string = format2.getString("codecs-string");
                            str = "videoCodec";
                            map.put(str, string);
                        }
                    }
                } else if (trackType == 2 && (format = trackInfo2.getFormat()) != null) {
                    if (format.containsKey("mime")) {
                        map.put("audioMime", format.getString("mime"));
                    }
                    if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                        string = format.getString("codecs-string");
                        str = "audioCodec";
                        map.put(str, string);
                    }
                }
            }
        }
        if (map.isEmpty()) {
            return;
        }
        pg0Var.f13875o.c("onMetadataEvent", map);
    }

    final /* synthetic */ void a(int i10) {
        qg0 qg0Var = this.B;
        if (qg0Var != null) {
            qg0Var.onWindowVisibilityChanged(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int i() {
        if (I()) {
            return this.f13880t.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int j() {
        if (Build.VERSION.SDK_INT < 26 || !I()) {
            return -1;
        }
        return this.f13880t.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int k() {
        if (I()) {
            return this.f13880t.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int l() {
        MediaPlayer mediaPlayer = this.f13880t;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rg0, com.google.android.gms.internal.ads.ph0
    public final void m() {
        H(this.f14779n.a());
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final int n() {
        MediaPlayer mediaPlayer = this.f13880t;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final long o() {
        return 0L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        this.f13884x = i10;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        m3.n1.k("AdMediaPlayerView completion");
        G(5);
        this.f13879s = 5;
        m3.b2.f25197i.post(new hg0(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = E;
        String str = (String) map.get(Integer.valueOf(i10));
        String str2 = (String) map.get(Integer.valueOf(i11));
        ze0.g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        G(-1);
        this.f13879s = -1;
        m3.b2.f25197i.post(new ig0(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        Map map = E;
        m3.n1.k("AdMediaPlayerView MediaPlayer info: " + ((String) map.get(Integer.valueOf(i10))) + ":" + ((String) map.get(Integer.valueOf(i11))));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f13882v
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.f13883w
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.f13882v
            if (r2 <= 0) goto L7a
            int r2 = r5.f13883w
            if (r2 <= 0) goto L7a
            com.google.android.gms.internal.ads.jh0 r2 = r5.f13885y
            if (r2 != 0) goto L7a
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L42
            if (r1 != r2) goto L41
            int r0 = r5.f13882v
            int r1 = r0 * r7
            int r2 = r5.f13883w
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r1 / r2
        L3a:
            r1 = r7
            goto L7a
        L3c:
            if (r1 <= r3) goto L60
            int r1 = r3 / r0
            goto L52
        L41:
            r0 = r2
        L42:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L54
            int r0 = r5.f13883w
            int r0 = r0 * r6
            int r2 = r5.f13882v
            int r0 = r0 / r2
            if (r1 != r3) goto L51
            if (r0 <= r7) goto L51
            goto L60
        L51:
            r1 = r0
        L52:
            r0 = r6
            goto L7a
        L54:
            if (r1 != r2) goto L64
            int r1 = r5.f13882v
            int r1 = r1 * r7
            int r2 = r5.f13883w
            int r1 = r1 / r2
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
        L60:
            r0 = r6
            goto L3a
        L62:
            r0 = r1
            goto L3a
        L64:
            int r2 = r5.f13882v
            int r4 = r5.f13883w
            if (r1 != r3) goto L70
            if (r4 <= r7) goto L70
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L72
        L70:
            r1 = r2
            r7 = r4
        L72:
            if (r0 != r3) goto L62
            if (r1 <= r6) goto L62
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L52
        L7a:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.jh0 r6 = r5.f13885y
            if (r6 == 0) goto L84
            r6.c(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pg0.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        m3.n1.k("AdMediaPlayerView prepared");
        G(2);
        this.f13876p.b();
        m3.b2.f25197i.post(new gg0(this, mediaPlayer));
        this.f13882v = mediaPlayer.getVideoWidth();
        this.f13883w = mediaPlayer.getVideoHeight();
        int i10 = this.A;
        if (i10 != 0) {
            u(i10);
        }
        if (this.f13877q && I() && this.f13880t.getCurrentPosition() > 0 && this.f13879s != 3) {
            m3.n1.k("AdMediaPlayerView nudging MediaPlayer");
            H(0.0f);
            this.f13880t.start();
            int currentPosition = this.f13880t.getCurrentPosition();
            long jA = j3.t.b().a();
            while (I() && this.f13880t.getCurrentPosition() == currentPosition && j3.t.b().a() - jA <= 250) {
            }
            this.f13880t.pause();
            m();
        }
        ze0.f("AdMediaPlayerView stream dimensions: " + this.f13882v + " x " + this.f13883w);
        if (this.f13879s == 3) {
            t();
        }
        m();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        m3.n1.k("AdMediaPlayerView surface created");
        E();
        m3.b2.f25197i.post(new jg0(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m3.n1.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f13880t;
        if (mediaPlayer != null && this.A == 0) {
            this.A = mediaPlayer.getCurrentPosition();
        }
        jh0 jh0Var = this.f13885y;
        if (jh0Var != null) {
            jh0Var.e();
        }
        m3.b2.f25197i.post(new lg0(this));
        F(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) throws IllegalStateException {
        m3.n1.k("AdMediaPlayerView surface changed");
        int i12 = this.f13879s;
        boolean z10 = false;
        if (this.f13882v == i10 && this.f13883w == i11) {
            z10 = true;
        }
        if (this.f13880t != null && i12 == 3 && z10) {
            int i13 = this.A;
            if (i13 != 0) {
                u(i13);
            }
            t();
        }
        jh0 jh0Var = this.f13885y;
        if (jh0Var != null) {
            jh0Var.c(i10, i11);
        }
        m3.b2.f25197i.post(new kg0(this, i10, i11));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f13876p.f(this);
        this.f14778m.a(surfaceTexture, this.B);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i10, int i11) {
        m3.n1.k("AdMediaPlayerView size changed: " + i10 + " x " + i11);
        this.f13882v = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f13883w = videoHeight;
        if (this.f13882v == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i10) {
        m3.n1.k("AdMediaPlayerView window visibility changed to " + i10);
        m3.b2.f25197i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.fg0
            @Override // java.lang.Runnable
            public final void run() {
                this.f8274m.a(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final long p() {
        if (this.D != null) {
            return (q() * this.f13884x) / 100;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final long q() {
        if (this.D != null) {
            return k() * this.D.intValue();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final String r() {
        return "MediaPlayer".concat(true != this.f13886z ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void s() throws IllegalStateException {
        m3.n1.k("AdMediaPlayerView pause");
        if (I() && this.f13880t.isPlaying()) {
            this.f13880t.pause();
            G(4);
            m3.b2.f25197i.post(new og0(this));
        }
        this.f13879s = 4;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void t() throws IllegalStateException {
        m3.n1.k("AdMediaPlayerView play");
        if (I()) {
            this.f13880t.start();
            G(3);
            this.f14778m.b();
            m3.b2.f25197i.post(new mg0(this));
        }
        this.f13879s = 3;
    }

    @Override // android.view.View
    public final String toString() {
        return pg0.class.getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void u(int i10) throws IllegalStateException {
        m3.n1.k("AdMediaPlayerView seek " + i10);
        if (!I()) {
            this.A = i10;
        } else {
            this.f13880t.seekTo(i10);
            this.A = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void w(qg0 qg0Var) {
        this.B = qg0Var;
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void x(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        Uri uri = Uri.parse(str);
        bm bmVarF = bm.f(uri);
        if (bmVarF == null || bmVarF.f6537m != null) {
            if (bmVarF != null) {
                uri = Uri.parse(bmVarF.f6537m);
            }
            this.f13881u = uri;
            this.A = 0;
            E();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void y() throws IllegalStateException {
        m3.n1.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f13880t;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f13880t.release();
            this.f13880t = null;
            G(0);
            this.f13879s = 0;
        }
        this.f13876p.d();
    }

    @Override // com.google.android.gms.internal.ads.rg0
    public final void z(float f5, float f10) {
        jh0 jh0Var = this.f13885y;
        if (jh0Var != null) {
            jh0Var.f(f5, f10);
        }
    }
}
