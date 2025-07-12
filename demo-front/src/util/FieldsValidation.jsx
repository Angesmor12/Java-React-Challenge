
function FieldValidation(value, type, maxLength, minLength){
    
        if (!value) return false; 
    
        if (typeof value !== type) return false; 

        if(type === "number"){
            value = value.toString();
        }

        if (maxLength === 0){
            if (value.length < minLength) return false
        }
        else if (value.length < minLength || value.length > maxLength) return false;

        return true;
}

function renderValue(value) {
    if (typeof value === 'object' && value !== null) {
        return (
            <div>
                {Object.keys(value).map((subKey) => {
                    return (
                        <div key={subKey}>
                            <strong>{subKey}:</strong> {renderValue(value[subKey])}
                        </div>
                    );
                })}
            </div>
        );
    }
    return value;
}

export { FieldValidation, renderValue };
