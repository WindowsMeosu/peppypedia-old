#include <windows.h>

int WINAPI WinMain(HINSTANCE hInstance, HINSTANCE hPrevInstance, 
    LPSTR lpCmdLine, int nCmdShow)
{
    MessageBox(NULL, "peppypedia-old cannot run as smoothly with high amounts of storage. If for whatever reason you don't want to/can't clear up storage then the website should prevail.", "Note", MB_OK);
    return 0;
}