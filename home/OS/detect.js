os= undefined;

const opc = document.getElementById("opc");

let oper = "We can't detect which operating system you're using through your browser."
if (navigator.appVersion.indexOf("Win") != -1) os = "Windows";
if (navigator.appVersion.indexOf("Mac") != -1) os = "MacOS";
if (navigator.appVersion.indexOf("X11") != -1) os = "Linux";
if (navigator.appVersion.indexOf("Linux") != -1) os = "Your OS displays itself as L";
if (navigator.appVersion.indexOf("Ubuntu") != -1) os = "Ubuntu(Linux)";
if (navigator.appVersion.indexOf("Debian") != -1) os = "Debian GNU/Linux";
if (navigator.appVersion.indexOf("POPOS") != -1) os = "PopOS(Linux)";
if (navigator.appVersion.indexOf("SteamOS") != -1) os = "SteamOS/SteamDeck(Linux)";
if (navigator.appVersion.indexOf("SteamDeck") != -1) os = "SteamOS/Linux";
if (navigator.appVersion.indexOf("Steam") != -1) os = "SteamOS/Linux";
if (navigator.appVersion.indexOf("KDE") != -1) os = "KDE/Linux";
if (navigator.appVersion.indexOf("KDEPlasma") != -1) os = "KDE Plasma/Linux";
if (navigator.appVersion.indexOf("Plasma") != -1) os = "KDE Plasma/Linux";
if (navigator.appVersion.indexOf("cat") != -1) os = "catOS/Linux";
if (navigator.appVersion.indexOf("kitten") != -1) os = "KittenOS/Linux";
if (navigator.appVersion.indexOf("arch") != -1) os = "Arch Linux";
if (navigator.appVersion.indexOf("Fedora") != -1) os = "Fedora Linux";
opc.innerHTML = "You're currently running:" + os;


