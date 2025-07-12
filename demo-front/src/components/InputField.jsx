

export default function InputField({value, setValue, placeholder, name, type}){
    return (
        <input defaultValue={value}  onChange={(e) => setValue(e.target.value)} name={name} className="login-form-input" type={type} placeholder={placeholder} />
    )
}