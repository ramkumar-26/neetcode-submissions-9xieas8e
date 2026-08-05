class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let sb = "";
        for(const str of strs){
            sb += str.length + "#" + str;
        }
        return sb;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        const res = [];
        let i =0;
        while(i < str.length){
            let j = i;
            while(str[j] !== "#"){
                j++;
            }
            const len = Number(str.slice(i, j));
            const word = str.slice(j+1, j+1+len);
            res.push(word);
            i = j+1+len;
        }
        return res;
    }
}
