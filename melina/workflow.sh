osascript << END
  tell application "iTerm2"
    tell current window
      tell current session
        write text "javac testpackage/Lebewesen.java"
        write text "javac testpackage/Menschen.java"
        write text "javac Test.java"
        write text "java Test"
      end
    end
  end
END