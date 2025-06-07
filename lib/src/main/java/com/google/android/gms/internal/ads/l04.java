package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l04 extends sz2 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f11283e;

    /* renamed from: f, reason: collision with root package name */
    private final DatagramPacket f11284f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f11285g;

    /* renamed from: h, reason: collision with root package name */
    private DatagramSocket f11286h;

    /* renamed from: i, reason: collision with root package name */
    private MulticastSocket f11287i;

    /* renamed from: j, reason: collision with root package name */
    private InetAddress f11288j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11289k;

    /* renamed from: l, reason: collision with root package name */
    private int f11290l;

    public l04(int i10) {
        super(true);
        byte[] bArr = new byte[AdError.SERVER_ERROR_CODE];
        this.f11283e = bArr;
        this.f11284f = new DatagramPacket(bArr, 0, AdError.SERVER_ERROR_CODE);
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final long a(ib3 ib3Var) throws IOException {
        Uri uri = ib3Var.f9669a;
        this.f11285g = uri;
        String host = uri.getHost();
        Objects.requireNonNull(host);
        int port = this.f11285g.getPort();
        h(ib3Var);
        try {
            this.f11288j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f11288j, port);
            if (this.f11288j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f11287i = multicastSocket;
                multicastSocket.joinGroup(this.f11288j);
                this.f11286h = this.f11287i;
            } else {
                this.f11286h = new DatagramSocket(inetSocketAddress);
            }
            this.f11286h.setSoTimeout(8000);
            this.f11289k = true;
            i(ib3Var);
            return -1L;
        } catch (IOException e5) {
            throw new wz3(e5, AdError.INTERNAL_ERROR_CODE);
        } catch (SecurityException e10) {
            throw new wz3(e10, AdError.INTERNAL_ERROR_2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final Uri d() {
        return this.f11285g;
    }

    @Override // com.google.android.gms.internal.ads.t53
    public final void f() throws IOException {
        this.f11285g = null;
        MulticastSocket multicastSocket = this.f11287i;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f11288j;
                Objects.requireNonNull(inetAddress);
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f11287i = null;
        }
        DatagramSocket datagramSocket = this.f11286h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f11286h = null;
        }
        this.f11288j = null;
        this.f11290l = 0;
        if (this.f11289k) {
            this.f11289k = false;
            g();
        }
    }

    @Override // com.google.android.gms.internal.ads.bh4
    public final int z(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f11290l == 0) {
            try {
                DatagramSocket datagramSocket = this.f11286h;
                Objects.requireNonNull(datagramSocket);
                datagramSocket.receive(this.f11284f);
                int length = this.f11284f.getLength();
                this.f11290l = length;
                w(length);
            } catch (SocketTimeoutException e5) {
                throw new wz3(e5, AdError.CACHE_ERROR_CODE);
            } catch (IOException e10) {
                throw new wz3(e10, AdError.INTERNAL_ERROR_CODE);
            }
        }
        int length2 = this.f11284f.getLength();
        int i12 = this.f11290l;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f11283e, length2 - i12, bArr, i10, iMin);
        this.f11290l -= iMin;
        return iMin;
    }
}
