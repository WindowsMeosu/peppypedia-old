#include <windows.h>

int WINAPI WinMain(HINSTANCE hInstance, HINSTANCE hPrevInstance, 
    LPSTR lpCmdLine, int nCmdShow)
{
    MessageBox(NULL, "Rate limited: Your HWID has been rate-limited indefinitely for attempting to inject scripts into either peppypedia-old or peppypedia-current (both websites are unaffected). If you believe this was a mistake, please use the website. This will NOT be reverted.", "Rate-limitation", MB_OK);
    return 0;
}