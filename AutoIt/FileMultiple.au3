WinWait("Open","",3000)
WinActivate("Open","")
ControlFocus("Open","","Edit1")
Sleep(10000)
ControlSetText("Open","","Edit1",$CmdLine[1])
Sleep(15000)
ControlClick("Open","","Button1")