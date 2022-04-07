function solution(arg1, arg2, arg3) {
    if(arg1>arg2) {
        if(arg2>arg3) {
            document.write(arg2);
        }
         if (arg2<arg3) {
            if(arg1>arg3) {
                document.write(arg3);
            }
            if(arg1<arg3) {
                document.write(arg1);
            }
            if(arg1==arg3) {
                document.write(arg2);
            }
        }
        if(arg2==arg3) {
            document.write(arg2);
        }

    }
    else if(arg1<arg2) {
        if(arg2>arg3) {
            if(arg1>arg3) {
                document.write(arg1);
            }
            else if(arg1<arg3) {
                document.write(arg3)
            }
            else {
                document.write(arg1);
            }
        }
        else if(arg2<arg3) {
            document.write(arg2);
        }
        else {
            document.write(arg1);
        }
    }
    else {
        if(arg2>arg3) {
            document.write(arg3);
        }
        if(arg2<arg3) {
            document.write(arg1);
        }
        if(arg2==arg3) {
            document.write(-1);
        }
    }

}

