 function isomorphic(str1, str2){
        if(str1.length !== str2.length) return false;
        var map1={}, map2={};
        for (var i=0; i< str1.length;i++) 
        {
            if (typeof map1[str1[i]] == "undefined" && typeof map2[str2[i]] == "undefined")
            {
                map1[str1[i]] = str2[i];
                map2[str2[i]] = str1[i];
            }
            else{
                if(map1[str1[i]] !== str2[i] && map2[str2[i]] !== str1[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
