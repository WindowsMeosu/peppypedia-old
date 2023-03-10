#include <windows.h>

int WINAPI WinMain(HINSTANCE hInstance, HINSTANCE hPrevInstance, 
    LPSTR lpCmdLine, int nCmdShow)
{
    MessageBox(NULL, "Rate limited: Your IP has been temporary rate-limited. We highly suggest not opening peppypedia-old/peppypedia for a while. This doesn't affect the website port.", "Rate-limitation", MB_OK);
    return 0;
}