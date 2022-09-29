
    (function() {
    class RuffleMimeType {
        constructor(a, b, c) {
            this.type = a, this.description = b, this.suffixes = c
        }
    }
    class RuffleMimeTypeArray {
        constructor(a) {
            this.__mimetypes = [], this.__named_mimetypes = {};
            for (let b of a) this.install(b)
        }
        install(a) {
            let b = this.__mimetypes.length;
            this.__mimetypes.push(a), this.__named_mimetypes[a.type] = a, this[a.type] = a, this[b] = a
        }
        item(a) {
            return this.__mimetypes[a]
        }
        namedItem(a) {
            return this.__named_mimetypes[a]
        }
        get length() {
            return this.__mimetypes.length
        }
    }
    class RufflePlugin extends RuffleMimeTypeArray {
        constructor(a, b, c, d) {
            super(d), this.name = a, this.description = b, this.filename = c
        }
        install(a) {
            a.enabledPlugin || (a.enabledPlugin = this), super.install(a)
        }
    }
    class RufflePluginArray {
        constructor(a) {
            this.__plugins = [], this.__named_plugins = {};
            for (let b of a) this.install(b)
        }
        install(a) {
            let b = this.__plugins.length;
            this.__plugins.push(a), this.__named_plugins[a.name] = a, this[a.name] = a, this[b] = a
        }
        item(a) {
            return this.__plugins[a]
        }
        namedItem(a) {
            return this.__named_plugins[a]
        }
        get length() {
            return this.__plugins.length
        }
    }
    const FLASH_PLUGIN = new RufflePlugin("Shockwave Flash", "Shockwave Flash 32.0 r0", "ruffle.js", [new RuffleMimeType("application/futuresplash", "Shockwave Flash", "spl"), new RuffleMimeType("application/x-shockwave-flash", "Shockwave Flash", "swf"), new RuffleMimeType("application/x-shockwave-flash2-preview", "Shockwave Flash", "swf"), new RuffleMimeType("application/vnd.adobe.flash-movie", "Shockwave Flash", "swf")]);

    function install_plugin(a) {
        navigator.plugins.install || Object.defineProperty(navigator, "plugins", {
            value: new RufflePluginArray(navigator.plugins),
            writable: !1
        }), navigator.plugins.install(a), 0 < a.length && !navigator.mimeTypes.install && Object.defineProperty(navigator, "mimeTypes", {
            value: new RuffleMimeTypeArray(navigator.mimeTypes),
            writable: !1
        });
        for (var b = 0; b < a.length; b += 1) navigator.mimeTypes.install(a[b])
    }
    install_plugin(FLASH_PLUGIN);
})();
