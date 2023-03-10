#include <windows.h>

int WINAPI WinMain(HINSTANCE hInstance, HINSTANCE hPrevInstance, 
    LPSTR lpCmdLine, int nCmdShow)
{
    MessageBox(NULL, "This page cannot be loaded. The following page in question, is titled; %2. "Note", MB_OK);
    return 0;
}